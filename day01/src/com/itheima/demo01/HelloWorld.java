package com.itheima.demo01;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 一.java中的数据类型
 * 
 * 1.基本数据类型:四类 八种
 * 		byte(1) boolean(1) short(2) char(2) int(4) float(4) long(8) double(8)
 * 
 * 2.引用数据类型
 * 		String , 数组,集合ArrayList,Scanner,Random,自定义类型
 * 
 * 二.引用数据类型String中的方法(4532)
 * 
 * 第一组:判断方法
 * 		boolean equals(String str);//比较两个字符串的内容是否相等
 * 		boolean equalsIgnoreCase(String str);//比较两个字符串的内容是相等(忽略大小写)
 * 		boolean startsWith(String subStr);//判断某个字符串是否以指定的子串开头
 * 		boolean endsWith(String subStr);//判断某个字符串是否以指定的子串结尾
 * 第二组:获取方法
 * 		int length();//获取字符串中字符个数
 * 		char charAt(int index);//获取字符串中某一个字符
 * 		String substring(int startIndex);//从指定下标开始截取字符串,直到字符串的末尾
 * 		String substring(int startIndex,int endIndex);//从指定下标开始截取字符串,到指定下标结束(包括开头不包括结尾)
 * 		---可忽略  int indexof(String subStr);//获取子串第一次出现的下标
 * 第三组:转换方法
 * 		String toLowerCase();//转成小写串
 * 		String toUpperCase();//转成大写串
 * 		Char[] toCharArray();//变成字符数组
 * 第四组:其他方法
 * 		String trim();//去掉字符串两端的空格
 * 		String[] split(String str);//切割字符串
 * 
 * 三:流_读写文件
 * 		输出流:数据从java程序 到  文件中
 * 		FileWriter:文件的字符输出流,写数据(一个字符,一个字符串,一个字符数组)
 * 			write(int ch);//写一个字符(可以写字符的ASCII码值)
 * 			write(char[] chs);//写一个字符数组
 * 			write(String s);//写一个字符串
 * 			write(char[] chs,int startIndex,int len);//写一个字符数组的一部分
 * 			write(String s,int startInex,int len);//写一个字符串的一部分
 * 
 * 		输入流:数据从 文件 到java程序
 * 		FileReader:文件的字符输入流,读数据(一个字符,一个字符数组)
 * 			int read();//读取一个字符
 * 			int read(char[] chs);//一个读取一个字符数组,返回值表示实际读取到的字符的个数
 * 			
 * 		文件的路径分为两种:
 * 		1.相对路径:
 * 			相对于当前项目而言的
 * 
 * 		2.绝对路径:
 * 			以盘符开头  C: D:
 * 
 */
public class HelloWorld {
	public static void main(String[] args) throws IOException {
		//1.FileWriter
//		FileWriter fw = new FileWriter("1.txt");
//		
////		fw.write("java", 1, 2);
//		char[] chs = {'a','b','c','d'};
//		fw.write(chs, 2, 1);
//		
//		fw.close();
		//2.FileReader
		FileReader fr = new FileReader("1.txt");
//		int ch = fr.read();//a-97 A-65 0-48
//		System.out.println((char)ch);
		char[] chs = new char[4];
		int len = fr.read(chs);
		
		System.out.println(len);
		
		String s = new String(chs);
		System.out.println(s);
		
		
		fr.close();
	}
}
