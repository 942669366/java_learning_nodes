package com.itheima.demo02;
/*
 * ����һ����׼��Dog��
 * 
 * 1.��װ(private+get/set)
 * 2.����
 */
public class Dog {
	private int age;
	private String name;
	//get/set
	//��ݼ�:atl+shift+s,r
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
	//���췽��"
	//��ݼ�:atl+shift+s,c  �޲ι���
	//��ݼ�:atl+shift+s,o  �вι���
	public Dog() {
	}
	public Dog(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	//eat�Է�
	public void eat(){
		System.out.println("�����ڳ�shi");
	}
	
	
	
	
}
