package com.citizeninn.ws;

import javax.jws.WebService;

@WebService(name = "RequestHandlerSEI", targetNamespace = "http://ws.citizeninn.com/")
public interface RequestHandlerSEI {

	public String sayHello();

}