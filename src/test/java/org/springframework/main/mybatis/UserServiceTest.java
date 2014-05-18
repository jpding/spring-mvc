package org.springframework.main.mybatis;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.main.mybatis.domain.User;
import org.springframework.main.mybatis.service.UserService;

public class UserServiceTest {
	
	@Test
	public void userServiceTest(){
		ApplicationContext context = new ClassPathXmlApplicationContext("/META-INF/spring/applicationContext.xml");
		UserService userService = context.getBean("userService", UserService.class);
		User user = new User();
		user.setId("003");
		user.setName("AAA");
		
		Map map = new HashMap();
		map.put("id", "002");
		map.put("name", "BBB");
		
		userService.insertUser(user);
		
		try{
			System.out.println(userService.countAll());
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
}
