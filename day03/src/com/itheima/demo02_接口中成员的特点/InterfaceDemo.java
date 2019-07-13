package com.itheima.demo02_接口中成员的特点;

import java.util.ArrayList;

/*
 *  5.接口中成员的特点
 * 		5.1成员变量,但是必须有固定修饰符 public static final 数据类型 变量= 值
 * 			固定修饰符 我们可以不写,也可以按心情写,但是不写不代表没有,编译器自动添加
 * 
 * 		5.2成员方法,必须是是固定修饰符 public abstract 即 抽象方法
 * 			固定修饰符 我们可以不写,也可以按心情写,但是不写不代表没有,编译器自动添加
 * 
 * 		5.3接口不可以创建对象(抽象类也是)
 * 		5.4实现类 实现类接口 ,那么必须重写接口中所有的抽象方法,然后才能创建对象
 * 			否则 这个实现类 还是一个抽象类,是不能创建对象的
 * 
 * 		在开发中最常用的模式:
 * 			一个类 继承 一个抽象类, 同时 实现多个接口
 * 			public class A extends AbstractClassB implments 接口A,接口B{
 * 				注意:
 * 				A类中必须重写 抽象类中的抽象方法,以及所有接口中的所有抽象方法
 * 			}
 */
public class InterfaceDemo {
	public static void main(String[] args) {
		//MyInterface i = new MyInterface();
	}
}
