package org.springframework.main.mybatis.daoimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.main.mybatis.dao.UserDao;
import org.springframework.main.mybatis.domain.User;
import org.springframework.main.mybatis.mapper.UserMapper;
import org.springframework.stereotype.Service;

@Service("userDao")
public class UserDaoImpl implements UserDao {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public int countAll() {
		return userMapper.countAll();
	}

	@Override
	public void insertUser(User user) {
		userMapper.insertUser(user);
	}

	@Override
	public List<User> getAllUser() {
		return userMapper.getAllUser();
	}

	@Override
	public User getById(String id) {
		return userMapper.getById(id);
	}

	@Override
	public void deleteUser(String id) {
		userMapper.deleteUser(id);
	}

	@Override
	public void udpateUser(Map<String, Object> map) {
		userMapper.updateUser(map);
	}
}
