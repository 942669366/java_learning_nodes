package com.itheima.demo07_HashSet存储自定义方式;

import java.util.HashSet;

import com.itheima.demo04_对象的哈希值.Person;

/*
 * 使用HashSet存储自定义元素(Dog对象)
 * 
 * 结论：
 * 		如果我们自定义了类，要使用HashSet存储
 * 		如果保证元素的唯一性：
 * 				必须重写自定义类的两个方法，hashCode和quals
 * 
 * 定义一个标准的类：
 * 			1、封装(private+get/set)
 * 			2、构造(无参+全参)
 * 			3、tostring(快速打印对象信息)
 * 			4、hashCode和equals(保证元素使用哈希表结构存储时的唯一性)
 * 
 * 
 */
public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1、创建集合
		HashSet<Dog> dogs = new HashSet<Dog>();
		dogs.add(new Dog("旺财", 25));
		dogs.add(new Dog("老旺财",15));
		dogs.add(new Dog("小旺财",20));
		dogs.add(new Dog("李欢",8));
		System.out.println(dogs);  
	}

}
