package com.itheima.demo01_反馈和回顾;

public class Test {
	//每一个对象 都有一份成员变量
	//每一个Test都有一份  s,a
	
	//实例(对象)成员变量
	Student s = new Student("成员变量显式初始化的时候"); 
	int a = 10;
		//静态代码块
	static { //1.Test类被加载的时候执行
		System.out.println("Test 类的静态代码块"); //1
	} 
	public static void main(String[] args) { 
		System.out.println("main方法"); //2
		//创建学生对象
		Student s1 = new Student("main方法中"); 
		//创建Test对象
		Test t = new Test(); 
	}

}
