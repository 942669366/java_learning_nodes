package com.itheima.demo06_继承中子类成员的特点;
/*
 * 继承中子父类的成员变量的特点:
 * 		1.子父类的成员变量不同名时,没有任何问题
 * 		2.子父类的成员变量同名时, 使用子类的对象访问该成员变量时,优先访问子类自己的
 * 
 * 
 * 继承中子父类的成员方法的特点:
 * 		1.子父类的成员方法不同名时,没有任何问题
 * 		2.子父类的成员方法同名时,使用子类的对象调用该成员方法时,优先调用子类自己的
 * 		
 * 结论:
 * 		无论是调用成员方法还是访问成员变量
 * 			优先访问子类自己的,如果子类没有,再去访问父类的,如果父类也没有那就报错
 * 
 * 
 * 
 */
public class ExtendsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.创建子类对象
		Zi zz = new Zi();
		//子父类成员变量不同名
//		System.out.println(zz.num1);
//		System.out.println(zz.num2);
		//子父类成员变量同名
//		System.out.println(zz.num);
		
		//子父类成员方法不同名
//		zz.showFu();
//		zz.showZi();
		//子父类成员方法同名
		zz.show();
		
	}

}
