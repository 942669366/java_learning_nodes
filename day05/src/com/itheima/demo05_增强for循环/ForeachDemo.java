package com.itheima.demo05_��ǿforѭ��;

import java.util.ArrayList;
import java.util.Collection;

/*
 * ��ǿforѭ������ͨ��forѭ����ǿ����?
 * 		��ǿ���﷨�ϸ��Ӽ�
 * 
 * ��ʽ:
 * 		for(�������� ������:����/����){
 * 			syso(������);
 * 		}
 * 
 * ע��:
 * 		����ʹ����ǿforѭ���������ϵ�ʱ��
 * 		�ײ���õ��ǵ�����	
 * �ܽ�: ����ʹ����ǿforѭ���������ϵ�ʱ��,�����޸ļ��ϵĳ���
 * 
 */
public class ForeachDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.��������
		/*int[] nums = {1,2,34,5,6,7};
		for(int m :nums){
			System.out.println(m);
		}*/
		//2.���弯��
		Collection<String> names = new ArrayList<String>();
		names.add("abc");
		names.add("jack");
		names.add("rose");
		names.add("tom");
		
		for(String name:names){
			System.out.println(name);
			names.add("����");
		}
		
		
	}

}
