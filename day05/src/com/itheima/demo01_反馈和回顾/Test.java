package com.itheima.demo01_�����ͻع�;

public class Test {
	//ÿһ������ ����һ�ݳ�Ա����
	//ÿһ��Test����һ��  s,a
	
	//ʵ��(����)��Ա����
	Student s = new Student("��Ա������ʽ��ʼ����ʱ��"); 
	int a = 10;
		//��̬�����
	static { //1.Test�౻���ص�ʱ��ִ��
		System.out.println("Test ��ľ�̬�����"); //1
	} 
	public static void main(String[] args) { 
		System.out.println("main����"); //2
		//����ѧ������
		Student s1 = new Student("main������"); 
		//����Test����
		Test t = new Test(); 
	}

}
