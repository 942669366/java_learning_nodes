package com.itheima.demo04_�����޸��쳣;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * ʹ��Iterator���������ǿforѭ����������,
 * ������֡�itcast���ַ���,
 * ��ô�򼯺������һ����д�ġ�ITCAST���ַ���
 * 
 * ������������һ���쳣:
 * 		Concurrent(����)Modification(�޸�)Exception
 * 		java�涨,���һ������ʹ�õ���������,��ô�ڱ����Ĺ����� �������޸ļ��ϵĳ���(���ӻ���ɾ��)
 * 		
 */
public class ConcurrentModificationExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.����һ������
		Collection<String> its = new ArrayList<String>();
		its.add("alibaba");
		its.add("tencent");
		its.add("itcast");
		its.add("baidu");
		its.add("sohu");
		its.add("netease");
		//2.ʹ�õ�������������
		//2.1 ��ȡ���ϵĵ���������
		Iterator<String> it = its.iterator();
		//2.2ѭ������
		while(it.hasNext()){
			String itname = it.next();
			if("itcast".equals(itname)){
				//������,���һ����д"ITCAST"
				its.add("ITCAST");
			}
		}
		
	}

}
