package com.itheima.demo08_方法调用链;

public class MethodDemo {
	public static void main(String[] args) {
		//1.StringBuilder
		/*StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = sb.append(123);
		StringBuilder sb2 = sb1.append("456");*/
		//使用链式编程
		StringBuilder sb = new StringBuilder();
		sb.append(123).append("4567").append(true);
		//另外一个形式的链式编程
		int ch = getName().substring(5).substring(2).length();
		System.out.println(ch);
		
	}
	
	public static String getName(){
		return "ILOVEJAVA";
	}
}
