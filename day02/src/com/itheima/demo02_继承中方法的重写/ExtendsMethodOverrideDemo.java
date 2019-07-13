package com.itheima.demo02_继承中方法的重写;
/*
 * 1.方法的重载(overload):
 * 	 在同一个类,方法名相同,但是参数列表不同,这时候这几个方法被称为方法的重载
 * 		参数列表不同:
 * 		参数个数不同,参数类型不同,参数顺序不同
 * 			
 * 
 * 2.方法的重写(override,覆盖,覆写):
 * 		在继承中,子类出现了和父类一模一样的方法,那么子类中这个方法被称为方法的重写
 * 
 * 3.方法重写的作用:
 * 		a.为什么要进行方法的重写
 * 		案例:手机案例
 * 		父类:手机类
 * 		子类:智能机
 */
public class ExtendsMethodOverrideDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zi zz = new Zi();
		zz.show();
		
	}

}
