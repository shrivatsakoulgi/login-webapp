package com.axisbank.sampleWebApp.controller;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyDispatcherServlet extends 
AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	// list of controller classes
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {MyController.class};
	}

	// List all the mappings
	@Override
	protected String[] getServletMappings() {
		return new String[] {"/login"};
	}
}
