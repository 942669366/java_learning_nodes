package com.itheima.demo07_������E�ĺ���;

import java.util.ArrayList;

/*
 * ������E�ĺ���:
 * 		��һ��"����",��������һ����������
 * ���Ϳ�����������,������,�ӿ���
 * 		
 * 1.������������: ������
 * 		��ʽ:public class ����<E>
 * 		�������ϵķ���E ����ʲôʱ��ȷ��?
 * 			���㴴������Ķ����ʱ��,�Ϳ���ȷ��
 * 2.�������ڷ�����:���ͷ���
 * 		��ʽ:public <T> ����ֵ���� ������(T t);
 * 			���ͷ����ϵ�T ����ʲôʱ��ȷ��?
 * 			������÷���,���ݲ�����ʱ��ȷ��
 * 3.�������ڽӿ���:���ͽӿ�
 * 		��ʽ:
 * 			public interface �ӿ���<E>	
 * 			���ͽӿ��ϵķ��� ����ʲôʱ��ȷ��?
 * 			1.ʵ����ʵ�ֽӿڵ�ʱ��,ֱ��ȷ��
 * 			2.ʵ����ʵ�ֽӿڵ�ʱ��,��ȷ������,����ֱ�Ӱѷ��ͼ̳�����
 * 				�����ʵ���ഴ�������ʱ��ȷ��
 * 
 */
public class GenericDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.����һ��Person
//		Person p = new Person();
//		p.setAaa("123");
		//2.����һ��Person<E>
		/*Person<String> pp = new Person<String>();
		pp.setAaa("С��");
		String aaa = pp.getAaa();*/
		/*Person<Integer> pp = new Person<Integer>();
		pp.setAaa(123);
		Integer aaa = pp.getAaa();*/
		//3.ʹ�÷��ͷ���
		/*Person<String> pp = new Person<String>();
		pp.show("abcd");*/
		
	}

}
