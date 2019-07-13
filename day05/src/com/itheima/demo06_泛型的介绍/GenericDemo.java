package com.itheima.demo06_泛型的介绍;

import java.util.ArrayList;

/*
 * 泛型:
 * 		泛泛的类型,不确定的类型
 * 格式:
 * 		<E>,<K,V>
 * 
 */
public class GenericDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo02();
	}
	//不使用泛型
	//就是不写<E>
	public static void demo01(){
		//1.创建一个集合ArrayList
		ArrayList names = new ArrayList();
		names.add("itcast");
		names.add(123);
		names.add(true);
		names.add(new Dog());
		//2.遍历
		//foreach
		for (Object obj : names) {
			String s = (String)obj;
			System.out.println(s.length());;
		}
		
	}
	//使用泛型
	public static void demo02(){
		//1.创建一个集合ArrayList
		ArrayList<String> names = new ArrayList<String>();
		names.add("itcast");
		names.add("123");
		names.add("true");
		//2.遍历
		for (String name : names) {
			System.out.println(name.length());
		}
	}

}
