package io.github.ensyb.phone.application.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.dbcp2.BasicDataSource;

public class Request {

	private final String xmlHttpR = "XMLHttpRequest"; 
	
	private final HttpServletRequest request;
	
	public Request(HttpServletRequest request, HttpServletResponse response) {
		this.request = request;
	}
	
	public boolean isRequestAjax(){
		return  xmlHttpR.equals(request.getHeader("X-Requested-With"));
	}
	
	public BasicDataSource useDataSource(){
		return (BasicDataSource) this.request.getServletContext().getAttribute("dataSource");
	}
	
	public void setAttribute(final String name, final Object object){
		this.request.setAttribute(name, object);
	}

	public Object getAttribute(final String name){
		return this.request.getAttribute(name);
	}
	
	public String getParameter(final String name){
		return this.request.getParameter(name);
	}
	
	
}