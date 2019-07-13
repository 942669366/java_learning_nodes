package com.itheima.demo06_匿名内部类;

//1创建子类 继承 抽象类
public class Dog extends AbstractAnimal{

	//2.重写所有的抽象方法
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("汪汪~~好吃");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("呼噜呼噜....");
	}
}
