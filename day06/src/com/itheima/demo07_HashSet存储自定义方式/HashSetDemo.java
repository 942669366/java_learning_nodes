package com.itheima.demo07_HashSet�洢�Զ��巽ʽ;

import java.util.HashSet;

import com.itheima.demo04_����Ĺ�ϣֵ.Person;

/*
 * ʹ��HashSet�洢�Զ���Ԫ��(Dog����)
 * 
 * ���ۣ�
 * 		��������Զ������࣬Ҫʹ��HashSet�洢
 * 		�����֤Ԫ�ص�Ψһ�ԣ�
 * 				������д�Զ����������������hashCode��quals
 * 
 * ����һ����׼���ࣺ
 * 			1����װ(private+get/set)
 * 			2������(�޲�+ȫ��)
 * 			3��tostring(���ٴ�ӡ������Ϣ)
 * 			4��hashCode��equals(��֤Ԫ��ʹ�ù�ϣ��ṹ�洢ʱ��Ψһ��)
 * 
 * 
 */
public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1����������
		HashSet<Dog> dogs = new HashSet<Dog>();
		dogs.add(new Dog("����", 25));
		dogs.add(new Dog("������",15));
		dogs.add(new Dog("С����",20));
		dogs.add(new Dog("�",8));
		System.out.println(dogs);  
	}

}
