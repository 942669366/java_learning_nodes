package com.itheima.demo04_总结this和super;

public class Pig {
	int age;
	String name;
	public Pig() {
		// TODO Auto-generated constructor stub
		this(18,"旺财");//构造的转移
	}
	public Pig(int age) {
		this(18,"旺财");
		//this.age = age;
	}
	public Pig(String name) {
		this(18,"旺财");
	}
	public Pig(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	
	
}
