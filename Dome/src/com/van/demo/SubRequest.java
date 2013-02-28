package com.van.demo;

public class SubRequest<RESULT> extends Request<RESULT> {

	Class<RESULT> clazz;
	
	public SubRequest(Class<RESULT> clazz) {
		super(clazz);
		this.clazz = clazz;
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public RESULT getResult() {
		System.out.println("Result::" + clazz.getName());
//		return clazz.newInstance();
//		return (RESULT)clazz;
		try {
			return clazz.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}

}
