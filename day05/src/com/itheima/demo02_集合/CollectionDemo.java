package com.itheima.demo02_����;

import java.util.ArrayList;
import java.util.Collection;

/*
 * Collection<E>���ӿ��ж���ķ���:��Щ����,���еļ����඼����
 * 
 * ��:��ӷ���
 * 		boolean add(E e);//���һ��Ԫ��,����ֵ��ʾ�Ƿ���ӳɹ�
 * ɾ:ɾ������
 * 		boolean remove(Object obj);//ɾ��ĳһ��Ԫ��,����ֵ��ʾ�Ƿ�ɾ���ɹ�
 * ��:�޸�Ԫ��
 * 		��
 * ��:��ȡĳһ��Ԫ��
 * 		��
 * ����:
 * 		int size();//��ȡ����
 * 		void clear();//ɾ������Ԫ��
 * 		boolean contains(Object obj);//�ж��Ƿ����objԪ��
 * 		Object[] toArray();//����ת��������
 */
public class CollectionDemo {

	public static void main(String[] args) {
		//1.����һ�����϶���,ʹ�ö�̬
		Collection<String> names = new ArrayList<String>();
		//2.���
		names.add("���¸�");
		names.add("���»�");
		names.add("����");
		names.add("��ΰ");
		//3.��ӡ
		System.out.println(names);
		//4.ɾ��
//		boolean b = names.remove("���¸�");
//		System.out.println(b);
//		System.out.println(names);
		//5.��ȡ����
//		int size = names.size();
//		System.out.println(size);
		//6.���
//		names.clear();//�� names=null
//		System.out.println(names.size());
		//7.�ж��Ƿ����
	/*	boolean b2 = names.contains("��С��");
		System.out.println(b2);*/
		//8.ת������
		Object[] objs = names.toArray();
		for (int i = 0; i < objs.length; i++) {
			System.out.println(objs[i]);
		}
		
		
	}

}
