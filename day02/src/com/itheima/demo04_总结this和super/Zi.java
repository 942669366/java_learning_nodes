package com.itheima.demo04_总结this和super;

public class Zi  extends Fu{
	String name;
	int id;//编号
	
	public Zi() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Zi(String name) {
		super();
		this.name = name;
	}

	
	//全参构造
	public Zi(String name,int id,int age){
		super(age);
		this.name = name;
		this.id = id;
//		this.age = age;
	}
	
	
	
}
