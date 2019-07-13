package com.itheima.demo09_笔记本案例最后实现;

public class Mouse implements USBInteface{
	//几个方法
	
	public void open(){
		System.out.println("鼠标打开了...");
	}
	public void use(){
		System.out.println("鼠标移动了...");
	}
	public void close(){
		System.out.println("鼠标关闭了...");
	}
}
