package com.itheima.demo01_static的介绍;
/*
 * 被static修饰的成员变量/成员方法的使用
 * 
 * 1.建议直接用类名调用
 * 		类名.静态成员变量名
 * 		类名.静态成员方法名(参数);
 * 		也可以通过对象,是不建议
 * 
 */
public class StaticDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//测试Demo类的静态和非静态成员
		//1.非静态,必须有对象
		Demo dd = new Demo();
		dd.a = 10;
		dd.show();
		//2静态,可以通过对象,但是建议通过类名
		dd.d = 3.14;
		dd.test();
		//建议用一下方式
		Demo.d = 1.11;
		Demo.test();
		
		
	}

}
