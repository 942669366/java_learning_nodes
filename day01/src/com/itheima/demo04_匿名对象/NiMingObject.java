package com.itheima.demo04_��������;

import com.itheima.demo02.Dog;

/*
 * ��������:(���ÿɲ���)
 * 		��������:û�����ֵĶ���
 * 		�﷨��: ֻ��������,���ǲ��ñ���������
 * 		���������ʹ��:
 * 			1.��������Ҳ��һ������,���ж�������й���
 * 			2.����������ص�:
 * 				ÿһ��ʹ����������ʱ,����һ���µĶ���
 * 				����:һ����������,ֻ��ʹ��һ��
 * 			3.��������ֻ����һ��
 * 
 * 				
 * 			
 * 				
 * 	
 */
public class NiMingObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.����������(�����Ķ���)
		Dog d = new Dog();
		
		d.setAge(10);
		d.setName("����");
		
		//d.eat();
		System.out.println(d.getAge()+"..."+d.getName());
		
		//2.��������
		new Dog();
		
		//3.���������ʹ��
		new Dog().setAge(18);
		new Dog().setName("����");
		
		System.out.println(new Dog().getAge()+"..."+new Dog().getName());
		//new Dog().eat();
	}

}
