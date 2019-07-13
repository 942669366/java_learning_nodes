package com.itheima.demo03_方法重写的引用_手机案例;
/*
 * 
 * 3.方法重写的作用:
 * 		a.为什么要进行方法的重写
 * 			当子类 发现 从父类继承过来的方法 不适用时  那么子类需要自己去重写这些方法
 * 		案例:手机案例
 * 		父类:手机类
 * 		子类:智能机
 * 
 * 4.注意事项:
 * 		a.权限问题: 子类重写方法的权限>=父类中方法权限
 * 			java中有四种权限:	从大到小
 * 				public protected default private
 * 		
 */
public class TestDemo {
	public static void main(String[] args) {
		//测试:AndroidPhone
		AndroidPhone vivo9s = new AndroidPhone();
		vivo9s.brand = "vivo大神机";
		vivo9s.price = 998.88;
		
		vivo9s.call();
		
		vivo9s.sendMsg();
		
	}
}
