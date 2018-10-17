package com.springframework.basis.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springframework.basis.formbean.User;
import com.springframework.basis.service.IService;

@Controller
@Scope("singleton")
public class UserActionImpl implements IAction {
	@Autowired
	@Qualifier("userServiceImpl")
	private IService userServiceImpl;

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public ModelAndView pageInit() {
		return new ModelAndView("user", "command", new User());
	}

	public String addUser(@ModelAttribute("adduser") User user, ModelMap model) {
		int rowNum = 0;
		userServiceImpl.service('I', user, rowNum);
		if (rowNum > 0) {
			model.addAttribute("asertFlag", "0");
			return "insertOK";
		} else {
			model.addAttribute("asertFlag", "1");
			return "insertError";
		}
	}

	public String errorPage() {
		// TODO Auto-generated method stub
		return null;
	}

	public String finalPage() {
		// TODO Auto-generated method stub
		return null;
	}

	public IService getUserService() {
		return userServiceImpl;
	}

	public void setUserService(IService userServiceImpl) {
		this.userServiceImpl = userServiceImpl;
	}

}
