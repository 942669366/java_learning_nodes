package com.itheima.demo02;
/*
 * 定义一个标准的Dog类
 * 
 * 1.封装(private+get/set)
 * 2.构造
 */
public class Dog {
	private int age;
	private String name;
	//get/set
	//快捷键:atl+shift+s,r
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//构造方法"
	//快捷键:atl+shift+s,c  无参构造
	//快捷键:atl+shift+s,o  有参构造
	public Dog() {
	}
	public Dog(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	//eat吃饭
	public void eat(){
		System.out.println("狗狗在吃shi");
	}
	
	
	
	
}
