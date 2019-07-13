package com.itheima.demo04_权限修饰符;

import com.itheima.demo02_final关键字的使用.Dog;

/*
 * java中有四个权限修饰符
 * 					public    protected(受保护的)  default(默认,不写就是default)   private(私有的)
 * 
 * 本类      			OK			OK					OK							OK
 * 
 * 同包不同类  			OK			OK					OK							NO
 * 
 * 不同包有子父类关系        OK			OK					NO							NO
 *
 * 不同包没有子父类关系  	OK			NO					NO							NO
 * 
 * 
 * 
 * 
 */
public class PublicDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//能不能访问pig中的age
		Pig pp = new Pig();
		pp.age = 10;
		//访问不同包的类中的成员
		Dog d = new Dog();
		d.age = 100;
	}

}
