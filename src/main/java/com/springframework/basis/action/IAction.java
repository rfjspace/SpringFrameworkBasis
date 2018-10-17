package com.springframework.basis.action;

import org.springframework.web.servlet.ModelAndView;

public interface IAction {
	public ModelAndView pageInit();
	public String errorPage();
	public String finalPage();

}
