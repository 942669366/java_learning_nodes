package com.itheima.demo06_��̬�ĺô��ͱ׶�;
/*
 * ����:
 * 	 ��̬���ó�Ա����ʱ,�������ж�������
 * 
 * 	��̬���ó�Ա����ʱ,���뿴���� ���п�����
 * 
 * 	�׶�: ��ֻ̬�ܵ����Ӹ��๲�еķ���, ���ܵ����������е�
 * 
 *  �ô�:��߳���������
 *  		����: ������������ ι��,ιè,ι��,ι�ϻ�
 *  	�ܽ�:
 *  		�������͵ı���,���Խ��� �κ�һ������Ķ���
 *  		���÷�����ʱ��,�����ǿ�����,����ʱ���еĴ��ݹ�������������еķ���
 *  			
 *  			
 *  		
 * 
 */
public class DuoTaiDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ι��
		Pig pp = new Pig();
		//feedPig(pp);
		feedAnimal(pp);
		//ιè
		Cat cc = new Cat();
		//feedCat(cc);
		feedAnimal(cc);
		//ι��
		Dog dd = new Dog();
		//feedDog(dd);
		feedAnimal(dd);
		//ι�ϻ�
		Animal tt = new Tiger();
		feedAnimal(tt);
	}
	//ι����
	public static void feedAnimal(Animal an){//Animal an = new Tiger();
		//Animal an = new Dog();
		//Animal an = new Cat();
		//Animal an = new Pig();;
		System.out.println("С����,�Է���");
		an.eat();
	}
	
/*	//ι��:
	public static void feedPig(Pig p){
		System.out.println("С����,�Է���...");
		p.eat();
	}
	//ιè
	public static void feedCat(Cat cc){
		System.out.println("С����,�Է���...");
		cc.eat();
	}
	//ι��
	public static void feedDog(Dog dd){
		System.out.println("С����,�Է���...");
		dd.eat();
	}*/

}
