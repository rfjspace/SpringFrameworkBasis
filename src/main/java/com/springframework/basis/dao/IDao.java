package com.springframework.basis.dao;

import java.util.List;

public interface IDao {
	public int selectForNum(String sql, Object[] paramter);

	public List<?> selectForObject(String sql, Object[] paramter);

	public int insert(String sql, Object[] paramter);

	public int updete(String sql, Object[] paramter);

	public int delete(String sql, Object[] paramter);
}
