package com.itheima.demo07_向上向下转型;

public class Dog extends Animal{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("吃骨头...");
	}
	
	public void lookHome(){
		System.out.println("汪汪,谁!!!!");
	}

}
