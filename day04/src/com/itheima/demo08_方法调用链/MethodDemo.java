package com.itheima.demo08_����������;

public class MethodDemo {
	public static void main(String[] args) {
		//1.StringBuilder
		/*StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = sb.append(123);
		StringBuilder sb2 = sb1.append("456");*/
		//ʹ����ʽ���
		StringBuilder sb = new StringBuilder();
		sb.append(123).append("4567").append(true);
		//����һ����ʽ����ʽ���
		int ch = getName().substring(5).substring(2).length();
		System.out.println(ch);
		
	}
	
	public static String getName(){
		return "ILOVEJAVA";
	}
}
