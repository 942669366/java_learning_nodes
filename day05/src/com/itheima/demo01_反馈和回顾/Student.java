package com.itheima.demo01_�����ͻع�;

public class Student {
	static { //��̬����� 1.ֻ��ִ��һ�� 2.��һ��ʹ�õ������
		System.out.println("Student ��ľ�̬�����"); //3
	} 
	public Student(){ 
		System.out.println("Student ��Ĺ��췽��"); 
	} 
	public Student(String methodName){
		System.out.println("��"+methodName+"����Student������õ�"); //4
	}  
}
