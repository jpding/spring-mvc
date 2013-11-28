package org.springframework.samples.mvc.webservice;

import javax.jws.WebService;

@WebService
public interface HelloWorld {
	public String sayHi(String text);
	
	public String save(String session);
}
