package org.springframework.main.mybatis.service;

import java.util.Map;

import org.springframework.main.mybatis.domain.User;

public interface UserService {
	public int countAll();
	public void insertUser(User user);
	public void update_insert(Map map, User user);
}
