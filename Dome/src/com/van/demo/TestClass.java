package com.van.demo;

public class TestClass extends BaseClass {

	@Override
	public void outTest(Class<?> clazz) {
		System.out.println("Test : " + clazz.getSimpleName());
	}

}
