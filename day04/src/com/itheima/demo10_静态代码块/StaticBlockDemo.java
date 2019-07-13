package com.itheima.demo10_静态代码块;
/*
 * 静态代码块的格式:
 * 		在类的成员位置
 * 			static{
 * 				写一句或者多句代码
 * 			}
 * 		特点:
 * 		1.当我们使用到这个类的时候,JVM自动执行静态代码块
 * 		2.只会执行一次,而且在第一次使用到这个类的时候执行,第二次使用不会执行了
 * 		3.静态代码块的优先级,很高,比构造方法高,比main方法高
 * 		4.静态代码块什么用?
 * 			用来初始化类的,mysql数据(静态代码块来加载驱动)
 */
public class StaticBlockDemo {
	static{
		System.out.println("!!!");
	}
	
	public static void main(String[] args) {
		System.out.println("......");
	}
}
