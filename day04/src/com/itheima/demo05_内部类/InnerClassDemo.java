package com.itheima.demo05_内部类;
/*
 * 内部类:
 * 		在一个类A里面 定义另外一个类B,那么B类称为内部类  A类叫外部类
 * 
 * 内部类有2种情况:
 * 		1.内部类定义在 成员位置
 * 			用法:
 * 			创建成员内部类的对象
 * 				错误的: 外部类名.内部类名 变量名 = new 外部类名.内部类名();
 * 				正确的: 外部类名.内部类名 变量名 = new 外部类().new 内部类();
 * 			
 * 		2.内部类定义在局部位置(了解)
 * 
 */
public class InnerClassDemo {
	public static void main(String[] args) {
		
		OuterClass.InnerClass2 c2 = new OuterClass().new InnerClass2();
	}
}
