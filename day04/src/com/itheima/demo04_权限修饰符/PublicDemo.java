package com.itheima.demo04_Ȩ�����η�;

import com.itheima.demo02_final�ؼ��ֵ�ʹ��.Dog;

/*
 * java�����ĸ�Ȩ�����η�
 * 					public    protected(�ܱ�����)  default(Ĭ��,��д����default)   private(˽�е�)
 * 
 * ����      			OK			OK					OK							OK
 * 
 * ͬ����ͬ��  			OK			OK					OK							NO
 * 
 * ��ͬ�����Ӹ����ϵ        OK			OK					NO							NO
 *
 * ��ͬ��û���Ӹ����ϵ  	OK			NO					NO							NO
 * 
 * 
 * 
 * 
 */
public class PublicDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ܲ��ܷ���pig�е�age
		Pig pp = new Pig();
		pp.age = 10;
		//���ʲ�ͬ�������еĳ�Ա
		Dog d = new Dog();
		d.age = 100;
	}

}
