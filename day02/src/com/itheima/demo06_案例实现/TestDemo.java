package com.itheima.demo06_案例实现;

public class TestDemo {
	public static void main(String[] args) {
		//测试:具体的子类
		//JavaEE
		JavaEE ee = new JavaEE();
		ee.age = 18;
		ee.id = 10086;
		ee.name = "李四";
		ee.work();
		
		//Netrepair
		NetRepair nr = new NetRepair();
		nr.id = 10000;
		nr.name = "王五";
		
		nr.work();
	}
}
