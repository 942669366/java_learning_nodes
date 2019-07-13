package com.itheima.demo08_泛型通配符;

import java.util.ArrayList;

/*
 * 通配符:
 * 		正则表达式中 "."代表任意字符
 * 		在DOS中 "*"代表任意内容
 * 泛型通配符:
 * 		?:代表任意类型
 * 		<? extends Animal> : 表示一种泛型,这种泛型必须是Animal 或者Animal的子类
 * 		<? super Animal>:表示一种泛型,这种泛型必须是Animal  或者Animal的父类
 * 
 * 在ArrayList中 有一个方法  
 * 			addAll(Collection c);//把集合c里面的每一个元素添加到ArrayList中
 * 
 */
public class GenericDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.第一个集合
		ArrayList<String> names1 = new ArrayList<String>();
		names1.add("111");
		names1.add("222");
		names1.add("333");
		names1.add("444");
		
		//2.第二个集合
		ArrayList<String> names2 = new ArrayList<String>();
		names2.add("aaa");
		names2.add("bbb");
		names2.add("ccc");
		names2.add("ddd");
		//3.第三个集合
		ArrayList<Integer> names3 = new ArrayList<Integer>();
		names3.add(123);
		names3.add(345);
		names3.add(567);
		//3.需求 把names2中的元素都添加到name1中
		//Collection<? extends String> c
		//The method addAll(Collection<? extends String>) 
		//in the type ArrayList<String> is not applicable 
		//for the arguments (ArrayList<Integer>)
		names1.addAll(names2);
		System.out.println(names1);
		
		
	}

}
