package org.springframework.main.mybatis.serviceimpl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.main.mybatis.dao.UserDao;
import org.springframework.main.mybatis.domain.User;
import org.springframework.main.mybatis.service.UserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public int countAll() {
		return this.userDao.countAll();
	}

	@Override
	public void insertUser(User user) {
		this.userDao.insertUser(user);
		throw new RuntimeException("Error");
	}

	@Override
	public void update_insert(Map map, User user) {
		this.userDao.udpateUser(map);
		this.userDao.insertUser(user);
		throw new RuntimeException("Error");
	}

}
