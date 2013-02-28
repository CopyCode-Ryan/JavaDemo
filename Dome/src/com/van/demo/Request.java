package com.van.demo;

public abstract class Request<RESULT> {
	
	Class<RESULT> clazz;
	
	public Request(Class<RESULT> clazz) {
		this.clazz = clazz;
	}
	
	public Class<RESULT> getResultType(){
		return clazz;
	}
	
	public abstract RESULT getResult();
}
