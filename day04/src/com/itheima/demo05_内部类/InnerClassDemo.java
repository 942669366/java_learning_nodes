package com.itheima.demo05_�ڲ���;
/*
 * �ڲ���:
 * 		��һ����A���� ��������һ����B,��ôB���Ϊ�ڲ���  A����ⲿ��
 * 
 * �ڲ�����2�����:
 * 		1.�ڲ��ඨ���� ��Աλ��
 * 			�÷�:
 * 			������Ա�ڲ���Ķ���
 * 				�����: �ⲿ����.�ڲ����� ������ = new �ⲿ����.�ڲ�����();
 * 				��ȷ��: �ⲿ����.�ڲ����� ������ = new �ⲿ��().new �ڲ���();
 * 			
 * 		2.�ڲ��ඨ���ھֲ�λ��(�˽�)
 * 
 */
public class InnerClassDemo {
	public static void main(String[] args) {
		
		OuterClass.InnerClass2 c2 = new OuterClass().new InnerClass2();
	}
}
