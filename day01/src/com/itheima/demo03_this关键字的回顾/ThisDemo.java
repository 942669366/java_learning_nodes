package com.itheima.demo03_this关键字的回顾;
/*
 * this关键字的使用:
 * 	this的作用:
 * 		区分局部变量和成员变量同名的情况
 * 			一般来说有this.xxx 指的就是成员变量
 * 			没有this修饰的变量,局部变量
 * 	this的本质: this实际上是一个对象
 * 		谁调用的方法,this指的就是谁
 * 			this指的是当前对象
 * 		
 * 				
 * 
 * 
 */
public class ThisDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.创建Student对象
		Student s = new Student();
		Student s1 = new Student();
		Student s2 = new Student();
		//2.调用方法
		s.setAge(18);;
		s1.setAge(18);;
		s2.setAge(18);;
		
		//System.out.println(s);
		System.out.println(s2);
	}

}






