package com.springframework.basis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.springframework.basis.dao.IDao;
import com.springframework.basis.formbean.User;

@Service
@Scope(value = "singleton")
public class UserServiceImpl implements IService {
	private IDao dao;

	public void service(char switchCase, Object formbean, Object rowNum) {
		User user = (User) formbean;
		switch (switchCase) {
		case 'I':
			String sqlI = "insert into user('id','name','password') value(?, ?, ?);";
			rowNum = dao.insert(sqlI, new Object[] { user.getId(), user.getName(), user.getPassword() });
			break;
		case 'S':
			String sqlS = "select * from user where id = ?";
			rowNum = dao.updete(sqlS, new Object[] { user.getId() });
			break;
		default:
			break;
		}

	}

	@Autowired
	@Required
	public void setDaoImpl(IDao daoImpl) {
		this.dao = daoImpl;
	}

}
