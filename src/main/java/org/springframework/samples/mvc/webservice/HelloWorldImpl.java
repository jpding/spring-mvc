package org.springframework.samples.mvc.webservice;

import javax.jws.WebService;

@WebService(endpointInterface="org.springframework.samples.mvc.webservice.HelloWorld")
public class HelloWorldImpl implements HelloWorld{

	@Override
	public String sayHi(String text) {
		System.out.println("sayHi called");
		return "Hello "+text;
	}

	@Override
	public String save(String session) {
		return "save "+session;
	}

}
