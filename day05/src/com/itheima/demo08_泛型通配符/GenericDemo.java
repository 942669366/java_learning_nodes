package com.itheima.demo08_����ͨ���;

import java.util.ArrayList;

/*
 * ͨ���:
 * 		������ʽ�� "."���������ַ�
 * 		��DOS�� "*"������������
 * ����ͨ���:
 * 		?:������������
 * 		<? extends Animal> : ��ʾһ�ַ���,���ַ��ͱ�����Animal ����Animal������
 * 		<? super Animal>:��ʾһ�ַ���,���ַ��ͱ�����Animal  ����Animal�ĸ���
 * 
 * ��ArrayList�� ��һ������  
 * 			addAll(Collection c);//�Ѽ���c�����ÿһ��Ԫ����ӵ�ArrayList��
 * 
 */
public class GenericDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.��һ������
		ArrayList<String> names1 = new ArrayList<String>();
		names1.add("111");
		names1.add("222");
		names1.add("333");
		names1.add("444");
		
		//2.�ڶ�������
		ArrayList<String> names2 = new ArrayList<String>();
		names2.add("aaa");
		names2.add("bbb");
		names2.add("ccc");
		names2.add("ddd");
		//3.����������
		ArrayList<Integer> names3 = new ArrayList<Integer>();
		names3.add(123);
		names3.add(345);
		names3.add(567);
		//3.���� ��names2�е�Ԫ�ض���ӵ�name1��
		//Collection<? extends String> c
		//The method addAll(Collection<? extends String>) 
		//in the type ArrayList<String> is not applicable 
		//for the arguments (ArrayList<Integer>)
		names1.addAll(names2);
		System.out.println(names1);
		
		
	}

}
