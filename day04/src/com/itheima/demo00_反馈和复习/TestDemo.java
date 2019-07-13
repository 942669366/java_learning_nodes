package com.itheima.demo00_反馈和复习;
/*
 * 1.谁的功能谁负责思想不是很懂，麻烦老师再讲一遍，3Q
 * 		武警开坦克打飞机
 * 		开坦克(){
 * 			坦克.打飞机();
 * 		}
 * 		饿了叫女友做饭
 * 		饿了(){
 * 			syso("...")
 * 			女友.做饭();
 * 		}
 * 		电脑,打开鼠标
 * 		电脑.user(){
 * 			鼠标.open();
 * 		}
 * 2.多态的转型有点懵
 * 		
 * 3.多态，向下转型 具体什么时候用呢？ 这个很模糊
 * 
 * 		复习:
 * 		1.多态的前提:
 * 		a.必须有继承或者实现
 * 		b.必须有方法的重写
 * 		c.表现形式:
 * 			父类类型  变量名 = new 子类类型();
 * 			接口类型 变量名 = new 实现类类型();
 * 		2.多态的成员的特点
 * 			使用多态调用成员变量: 编译看左边  运行看左边
 * 			使用多态调用成员方法: 编译看左边,运行看右边
 * 		3.多态的弊端:
 * 			不能调用子类特有的成员方法,只能调用子父类共有的成员方法
 * 		4.如果就是想调用子类特有的方法,怎么办?
 * 			向下转型,把父类类型的变量,转回到对应的子类类型上
 * 			
 * 
 * 4.接口有构造方法吗？ 抽象类? 有什么用?
 * 		接口没有构造
 * 		抽象类是有构造
 * 			因为所有的类 都有一个共同的父类	
 * 				public class Person  implements JiDUZHE{
 * 					
 * 					public Person(){
 * 						super();			
 * 					}
 * 				}
 * 
 * 5.this和suepr的语句形式 
 * 		this():调用本类构造
 * 		super():调用父类构造
 * 		this()和super()不能同时出现在一个构造方法的第一行
 * 		
 * 		public class Person{
 * 			String name;
 * 			public Person(){
 * 				super();
 * 			}
 * 			public Person(Sring name){
 * 				this();super();
 * 				this.name=name;
 * 			}
 * 
 * 		}
 * 
 * 
 */
public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
