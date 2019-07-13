package com.itheima.demo05_抽象类的介绍;
/*
 * 抽象类:
 * 		以前:一个类,如果类中包含抽象方法,那么这个类就是抽象类
 * 		现在:Java中规定,只要一个类是用abstract修饰 ,那么这个类就是抽象类
 * 		特点:
 * 			java规定,抽象类不能创建对象
 * 		抽象类不能创建对象,有什么作用?
 * 			抽象类天生就是作为父类
 * 			
 * 	
 * 抽象方法:
 * 		一个方法,如果只有声明,没有实现 那么这个方法就是抽象方法
 * 
 * 		抽象方法产生的?
 * 			当子类的共性不断向上抽取,抽取到一定程度,有些方法我们就不知道如何实现
 * 			那么我们就把这个方法称为抽象方法
 * 
 * 格式:
 * 		抽象方法必须由 关键字 abstract修饰
 * 			public abstract void work();
 * 		抽象类 必须由关键字 abstract修饰
 * 			public abstract class 类名{}
 * 
 * 	案例:
 * 		定义三个类,圆形类,正方形类,长方形类
 * 				共性: 求周长  求面积
 * 		抽取父类: 图形/多边形
 * 			求周长  求面积
 * 
 * 		public void TuXing{
 * 			//求面积
 * 			public double getMianJi();
 * 			//求周长
 * 
 * 		}
 * 案例:
 * 		员工类:
 * 			public void work();//抽象方法
 * 
 * 			讲师类(工作:上课),助教类(工作:辅导),班主任类(工作:管理)
 * 
 * 扩展:
 * 		1.Java中规定,只要一个类是用abstract修饰 ,那么这个类就是抽象类
 * 		2.以前:一个类,如果类中包含抽象方法,那么这个类就是抽象类
 * 
 */
public class AbstractClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//测试员工类
//		Employee ee = new Employee();
//		ee.work();
		//测试子类
		BanTeacher bt = new BanTeacher();
		bt.work();
	}

}
