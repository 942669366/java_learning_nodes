package com.itheima.demo06_���͵Ľ���;

import java.util.ArrayList;

/*
 * ����:
 * 		����������,��ȷ��������
 * ��ʽ:
 * 		<E>,<K,V>
 * 
 */
public class GenericDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo02();
	}
	//��ʹ�÷���
	//���ǲ�д<E>
	public static void demo01(){
		//1.����һ������ArrayList
		ArrayList names = new ArrayList();
		names.add("itcast");
		names.add(123);
		names.add(true);
		names.add(new Dog());
		//2.����
		//foreach
		for (Object obj : names) {
			String s = (String)obj;
			System.out.println(s.length());;
		}
		
	}
	//ʹ�÷���
	public static void demo02(){
		//1.����һ������ArrayList
		ArrayList<String> names = new ArrayList<String>();
		names.add("itcast");
		names.add("123");
		names.add("true");
		//2.����
		for (String name : names) {
			System.out.println(name.length());
		}
	}

}
