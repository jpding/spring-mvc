package org.springframework.main.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.main.mybatis.Easy;
import org.springframework.main.mybatis.EasyMapper;

public class TestMain {

	private static ClassPathXmlApplicationContext context;

	public static void main(String[] args) {
		System.out.println("=============");
		context = new  ClassPathXmlApplicationContext("/META-INF/spring/applicationContext.xml");
		DefaultSqlSessionFactory sessionFactory = context.getBean("sqlSessionFactory", DefaultSqlSessionFactory.class);
		
		SqlSession session = sessionFactory.openSession();
		try{
			EasyMapper mapper = session.getMapper(EasyMapper.class);
			Easy easy = mapper.getById(2);
			System.out.print(easy.getEname());
			System.out.print("\t");
			System.out.print(easy.getEpassword());
			System.out.println();
		}finally{
			session.close();
		}
	}

}
