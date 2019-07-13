package com.itheima.demo07_向上向下转型;

public class Cat extends Animal{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("吃鱼骨头...");
	}
	
	public void catchMouse(){
		System.out.println("杰瑞 弄死你...");
	}

}
