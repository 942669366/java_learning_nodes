package com.itheima.demo02_final关键字的使用;

public class Test {
	final int aa;
	//什么叫创建对象之前 
	public Test(){
		aa = 20;
	}
	
	//final修饰的方法,不能被子类重写
	public final void show(){
		
	}
}
