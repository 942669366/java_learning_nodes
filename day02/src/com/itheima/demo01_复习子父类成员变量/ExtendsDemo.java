package com.itheima.demo01_复习子父类成员变量;
/*
 * 继承中子父类出现了同名的成员变量时
 * 		通过子类对象优先方法子类自己的成员变量
 * 
 * 1.this:区分本类中的成员变量和局部变量同名情况
 * 2.super:区分子类中的成员变量和父类中的成员变量
 * 
 * 
 * 		
 * 
 * 
 */
public class ExtendsDemo {

	public static void main(String[] args) {
		//1.子父类成员变量同名
		Zi zz = new Zi();
		//zz.showNum();
	}

}
