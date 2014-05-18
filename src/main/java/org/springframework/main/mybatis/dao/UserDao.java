package org.springframework.main.mybatis.dao;

import java.util.List;
import java.util.Map;

import org.springframework.main.mybatis.domain.User;

public interface UserDao {
	public int countAll();
	public void insertUser(User user);
	public List<User> getAllUser();
	public User getById(String id);
	public void deleteUser(String id);
	public void udpateUser(Map<String, Object> map);
}
