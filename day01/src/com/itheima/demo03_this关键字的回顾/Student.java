package com.itheima.demo03_this�ؼ��ֵĻع�;

public class Student {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
//		this.age = age;
		System.out.println(this);
		//Student@19bb25a
	}

	public Student() {
	}

	public Student(int age) {
		this.age = age;
	}
	
	
}
