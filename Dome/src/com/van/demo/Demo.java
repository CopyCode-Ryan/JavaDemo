package com.van.demo;

/**
 * 
 * <br/>
 * description:调用样例
 * <br/>
 * author: fanruifa
 * <br/>
 * date: 2013-2-26
 *
 */
public class Demo {

	/**
	 * <br/>
	 * description:
	 * <br/>
	 * modify note:
	 * <br/>
	 * author： 
	 * <br/>
	 * date： 2013-2-26
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("参数为0");
		test();
		System.out.println("============");
		System.out.println("参数为1");
		test("1111");
		System.out.println("============");
		System.out.println("参数为2");
		test("1111","2222");
		System.out.println("============");
		System.out.println("参数为3");
		test("1111","2222","3333");
		System.out.println("============");
		System.out.println("参数为4");
		test("1111","2222","3333","4444");
		System.out.println("============");
		System.out.println("参数为5");
		test("1111","2222","3333","4444","5555");
		System.out.println("============");
		classTest(Test.class);
		System.out.println("============");
		TestListener(new TestClass(), Test.class);
		TestListener(new Test2Class(), Request.class);
		System.out.println("============");
		SubRequest<Test> subRequest = new SubRequest<Test>(Test.class);
//		subRequest.getResult();
		Test testRequest = subRequest.getResult();
		if (testRequest != null) {
			testRequest.outTest();
		} else {
			System.out.println("testRequest is null");
		}
		SubRequest<Test1> subRequest2 = new SubRequest<Test1>(Test1.class);
		Test1 test1 = subRequest2.getResult();
		if (test1 !=null) {
			test1.outTest();
		}
	}
	
	/**
	 * 
	 * <br/>
	 * description:根据传入参数个数的输出
	 * <br/>
	 * modify note:
	 * <br/>
	 * author： fanruifa
	 * <br/>
	 * date： 2013-2-26
	 * @param objects
	 */
	public static void test(Object... objects){
		for (int i = 0; i < objects.length; i++) {
			System.out.println((i + 1) + ":" + (String)objects[i]);
		}
	}
	
	public static void classTest(Class<?> objectClass){
		System.out.println(objectClass.getName() + ":" + objectClass.getSimpleName());
	}
	
	public static void TestListener(BaseClass baseClass, Class<?> clazz) {
		baseClass.outTest(clazz);
	}

}
