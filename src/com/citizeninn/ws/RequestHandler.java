package com.citizeninn.ws;

import javax.jws.WebService;

@WebService(targetNamespace = "http://ws.citizeninn.com/", endpointInterface = "com.citizeninn.ws.RequestHandlerSEI", portName = "RequestHandlerPort", serviceName = "RequestHandlerService")
public class RequestHandler implements RequestHandlerSEI {
	
	public String sayHello()
	{
		return "Hello";
	}

}
