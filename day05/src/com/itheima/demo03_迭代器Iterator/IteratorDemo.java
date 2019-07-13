package com.itheima.demo03_������Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * ���ϵı���:
 * 		�ڸ��ӿ��� ʹ����һ�ֹ����ı�����ʽ,����������
 * 1.��ȡһ�����ϵĵ���������(���������������Ǵ�����,����ÿ�������Դ�)
 * 2.ͨ��ѭ���������� �����������  hasNext �� next ����
 * 
 */
public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.����һ�����϶���,ʹ�ö�̬
		Collection<String> names = new ArrayList<String>();
		//2.���
		names.add("���¸�");
		names.add("���»�");
		names.add("����");
		names.add("��ΰ");
		names.add("��ΰ1");
		//3.��ȡnames���ϵĵ���������
		Iterator<String> it = names.iterator();
		//4.��׼����
		while(it.hasNext()){//�����ж���û����һ��Ԫ��
			String s = it.next();//�����ȡ����һ��Ԫ��
			System.out.println(s);
		}
		
		
	}

}
