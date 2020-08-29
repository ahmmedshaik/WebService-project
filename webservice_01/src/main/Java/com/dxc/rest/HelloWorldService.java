package com.dxc.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Path;

@Path("/hello")
public class HelloWorldService {

	@GET
	public String sayHello() {
	String hello = "HelloWorld";
		return hello;
	}
}
