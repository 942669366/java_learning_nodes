package com.itheima.demo03_this�ؼ��ֵĻع�;
/*
 * this�ؼ��ֵ�ʹ��:
 * 	this������:
 * 		���־ֲ������ͳ�Ա����ͬ�������
 * 			һ����˵��this.xxx ָ�ľ��ǳ�Ա����
 * 			û��this���εı���,�ֲ�����
 * 	this�ı���: thisʵ������һ������
 * 		˭���õķ���,thisָ�ľ���˭
 * 			thisָ���ǵ�ǰ����
 * 		
 * 				
 * 
 * 
 */
public class ThisDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.����Student����
		Student s = new Student();
		Student s1 = new Student();
		Student s2 = new Student();
		//2.���÷���
		s.setAge(18);;
		s1.setAge(18);;
		s2.setAge(18);;
		
		//System.out.println(s);
		System.out.println(s2);
	}

}






