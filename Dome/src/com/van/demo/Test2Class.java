package com.van.demo;

public class Test2Class extends BaseClass {

	@Override
	public void outTest(Class<?> clazz) {
		System.out.println("Test2 : " + clazz.getSimpleName());
	}

}
