package com.itheima.demo01;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * һ.java�е���������
 * 
 * 1.������������:���� ����
 * 		byte(1) boolean(1) short(2) char(2) int(4) float(4) long(8) double(8)
 * 
 * 2.������������
 * 		String , ����,����ArrayList,Scanner,Random,�Զ�������
 * 
 * ��.������������String�еķ���(4532)
 * 
 * ��һ��:�жϷ���
 * 		boolean equals(String str);//�Ƚ������ַ����������Ƿ����
 * 		boolean equalsIgnoreCase(String str);//�Ƚ������ַ��������������(���Դ�Сд)
 * 		boolean startsWith(String subStr);//�ж�ĳ���ַ����Ƿ���ָ�����Ӵ���ͷ
 * 		boolean endsWith(String subStr);//�ж�ĳ���ַ����Ƿ���ָ�����Ӵ���β
 * �ڶ���:��ȡ����
 * 		int length();//��ȡ�ַ������ַ�����
 * 		char charAt(int index);//��ȡ�ַ�����ĳһ���ַ�
 * 		String substring(int startIndex);//��ָ���±꿪ʼ��ȡ�ַ���,ֱ���ַ�����ĩβ
 * 		String substring(int startIndex,int endIndex);//��ָ���±꿪ʼ��ȡ�ַ���,��ָ���±����(������ͷ��������β)
 * 		---�ɺ���  int indexof(String subStr);//��ȡ�Ӵ���һ�γ��ֵ��±�
 * ������:ת������
 * 		String toLowerCase();//ת��Сд��
 * 		String toUpperCase();//ת�ɴ�д��
 * 		Char[] toCharArray();//����ַ�����
 * ������:��������
 * 		String trim();//ȥ���ַ������˵Ŀո�
 * 		String[] split(String str);//�и��ַ���
 * 
 * ��:��_��д�ļ�
 * 		�����:���ݴ�java���� ��  �ļ���
 * 		FileWriter:�ļ����ַ������,д����(һ���ַ�,һ���ַ���,һ���ַ�����)
 * 			write(int ch);//дһ���ַ�(����д�ַ���ASCII��ֵ)
 * 			write(char[] chs);//дһ���ַ�����
 * 			write(String s);//дһ���ַ���
 * 			write(char[] chs,int startIndex,int len);//дһ���ַ������һ����
 * 			write(String s,int startInex,int len);//дһ���ַ�����һ����
 * 
 * 		������:���ݴ� �ļ� ��java����
 * 		FileReader:�ļ����ַ�������,������(һ���ַ�,һ���ַ�����)
 * 			int read();//��ȡһ���ַ�
 * 			int read(char[] chs);//һ����ȡһ���ַ�����,����ֵ��ʾʵ�ʶ�ȡ�����ַ��ĸ���
 * 			
 * 		�ļ���·����Ϊ����:
 * 		1.���·��:
 * 			����ڵ�ǰ��Ŀ���Ե�
 * 
 * 		2.����·��:
 * 			���̷���ͷ  C: D:
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
