package com.itheima.demo09_笔记本案例最后实现;

public class KeyBoard implements USBInteface{
	public void open(){
		System.out.println("键盘打开了....");
	}
	public void use(){
		System.out.println("键盘敲击了....");
	}
	public void close(){
		System.out.println("键盘关闭了....");
	}
}
