package com.springframework.basis.service;

import com.springframework.basis.dao.IDao;

public interface IService {
	public void service(char switchCase, Object formbean, Object rowNum);

	public void setDaoImpl(IDao daoImpl);
}
