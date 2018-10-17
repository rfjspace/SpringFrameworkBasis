package com.springframework.basis.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springframework.basis.mapper.UserMapper;

@Repository
@Scope("singleton")
public class UserDaoImpl implements IDao {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public UserDaoImpl(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public int selectForNum(String sql, Object[] paramter) {
		return jdbcTemplate.queryForObject(sql, paramter, Integer.class);
	}

	public List<?> selectForObject(String sql, Object[] paramter) {
		return (List<?>) jdbcTemplate.queryForObject(sql, paramter, new UserMapper());
	}

	public int insert(String sql, Object[] paramter) {
		return jdbcTemplate.update(sql, paramter);
	}

	public int updete(String sql, Object[] paramter) {
		return jdbcTemplate.update(sql, paramter);
	}

	public int delete(String sql, Object[] paramter) {
		return jdbcTemplate.update(sql, paramter);
	}

}
