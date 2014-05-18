package org.springframework.main.mybatis.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.main.mybatis.domain.User;
import org.springframework.stereotype.Service;

@Service("userMapper")
public interface UserMapper {
	public int countAll();
	public void insertUser(User user);
	public List<User> getAllUser();
	public User getById(String id);
	public void deleteUser(String id);
	public void updateUser(Map<String, Object> map);
}
