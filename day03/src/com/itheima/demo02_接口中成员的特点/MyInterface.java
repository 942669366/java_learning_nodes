package com.itheima.demo02_接口中成员的特点;
/*
 * 接口可以定义成员变量和成员方法
 */
public interface MyInterface {
	//成员变量有固定修饰符:public static final
	 public static final int age = 18;
	
	//成员方法,必须是public abstract
	public abstract void show();
}
