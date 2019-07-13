package com.itheima.demo05_继承;
/*
 * *****继承: 面向对象有三大特点,封装,继承,多态
 * 		1.现实生活中的继承:
 * 				子 继承 父的遗产的过程
 * 		2.java中的继承:是两个类之间的关系
 * 				一个类(子类/派生类/sub)  可以 继承 另外一个类(父类/超类/基类/super),这个过程我们称为java中继承
 * 
 * 		3.继承这么写?
 * 			public class 子类  extends 父类{
 * 			
 * 
 * 			}
 * 		4.如果子类继承了父类,那么子类会自动拥有父类中所有的成员(但是private除外,父类中用private修饰成员子类不能直接拿过来用)
 * 			
 * 		5.继承的作用:
 * 			提高的代码的复用性
 * 	
 * 
 * 
 */
public class ExtendsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//测试我们刚刚定义几个类
		Teacher xiaopeng = new Teacher();
		xiaopeng.age = 19;
		xiaopeng.id = 10086;
		xiaopeng.name ="鹏鹏哥";
		xiaopeng.work();
		
		//=============
		HelpTeacher xiaohong = new HelpTeacher();
		xiaohong.age = 18;
		xiaohong.work();
		//===========
		BanTeacher xiaoxia = new BanTeacher();
		
		xiaoxia.id = 10010;
		xiaoxia.work();
		
		
		
	}

}
