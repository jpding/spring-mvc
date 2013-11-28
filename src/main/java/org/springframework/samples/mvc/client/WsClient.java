package org.springframework.samples.mvc.client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.samples.mvc.webservice.HelloWorld;

public class WsClient {
	public static void main(String [] args){
		JaxWsProxyFactoryBean bean = new JaxWsProxyFactoryBean();
		bean.setAddress("http://127.0.0.1:8080/spring-mvc-showcase/services/helloworld");
		bean.setServiceClass(HelloWorld.class);
		HelloWorld hello = bean.create(HelloWorld.class);
		System.out.println(hello.sayHi("xxx"));
	}
}
