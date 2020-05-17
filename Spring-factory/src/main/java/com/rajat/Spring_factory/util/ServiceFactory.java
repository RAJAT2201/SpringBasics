package com.rajat.Spring_factory.util;

import com.rajat.Spring_factory.service.LoginService;
import com.rajat.Spring_factory.service.UserService;

public class ServiceFactory {
	private static UserService userService = new UserService();
	private static LoginService loginService = new LoginService();
	private static ServiceFactory serviceFactory = new ServiceFactory();
	
	private ServiceFactory() {};
	public UserService createUserService() {
		return userService;
	}
	public LoginService createLoginService() {
		return loginService;
	}
	
	public static ServiceFactory createInstance() {
		return serviceFactory;
	}
}