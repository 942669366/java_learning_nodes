package com.itheima.demo05_�ڲ���;
//�ⲿ��
public class OuterClass {
	//��Ա�ڲ���
	class InnerClass2{
		int b = 20;
	}
	
	public void show(){
		//�ֲ��ڲ���
		class InnerClass1{
			int a = 10;
			
		}
		//��Ϊ�ֲ��ڲ��� ֻ���ھֲ�ʹ��
		InnerClass1 c1 = new InnerClass1();
		System.out.println(c1.a);
		
	}
	
	
	
	public void test(){
		//�ֲ��ڲ��� ֻ�����ඨ��ľֲ�����ʹ��
		//InnerClass1 c1 = new InnerClass1();
	}
	
	
	
}
