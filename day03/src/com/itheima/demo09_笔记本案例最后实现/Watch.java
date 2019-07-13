package com.itheima.demo09_笔记本案例最后实现;

public class Watch implements USBInteface{

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("手表开了...");
	}

	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("手表操作了..");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("手表关了...");
	}

}
