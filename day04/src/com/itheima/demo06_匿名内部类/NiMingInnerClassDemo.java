package com.itheima.demo06_�����ڲ���;
/*
 * �����ڲ���:
 * 		��һ��������﷨,�������ٴ�����������������
 * 					 �������ٴ���  �ӿڵ�ʵ�������
 * 		
 * ���������ڲ���:
 * 		����һ��������,Ҫ�󴴽�������������
 * 		1.��������,�̳г�����
 * 		2.��д�������е����г��󷽷�
 * 		3.new �������
 * 		����һ���ӿ�,Ҫ�󴴽��ýӿڵ�ʵ�������
 * 		1.����ʵ���� implments �ӿ�
 * 		2.��д�ӿ������еĳ��󷽷�
 * 		3.new ʵ�������
 * 
 */
public class NiMingInnerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3.new �������
		Dog d = new Dog();
		d.eat();
		d.sleep();
		
	}
	//�����ڲ��� ���ٴ����ӿڵ�ʵ�������
	public static void test02(){
		//��һ��
		new NvYouInterface(){
			@Override
			public void cook() {
			}

			@Override
			public void daoShui() {
			}

			@Override
			public void moMo() {
			}
		};
		//�ڶ���
		new NvYouInterface() {
			
			@Override
			public void moMo() {
				// TODO Auto-generated method stub
				System.out.println("����...");
			}
			
			@Override
			public void daoShui() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void cook() {
				// TODO Auto-generated method stub
				
			}
		}.moMo();
		//������
		NvYouInterface ni = new NvYouInterface() {
			
			@Override
			public void moMo() {
				// TODO Auto-generated method stub
				System.out.println("����");
			}
			
			@Override
			public void daoShui() {
				// TODO Auto-generated method stub
				System.out.println("��ˮ");
			}
			
			@Override
			public void cook() {
				// TODO Auto-generated method stub
				
			}
		};
		//���÷���
		ni.cook();
		ni.daoShui();
		ni.moMo();;
	}
	
	//�����ڲ��� ���ٴ�����������������
	public static void test01(){
		//ʹ�������ڲ������ ���� AbstractAnimal��������������
		//��һ�ַ�ʽ
		new AbstractAnimal(){

			@Override
			public void eat() {
				// TODO Auto-generated method stub
				System.out.println("��");
			}

			@Override
			public void sleep() {
				// TODO Auto-generated method stub
				System.out.println("˯");
			}
			
			
		};
		//�ڶ���
		new AbstractAnimal(){
			@Override
			public void eat() {
				// TODO Auto-generated method stub
				System.out.println(".....");
			}
			@Override
			public void sleep() {
				// TODO Auto-generated method stub
				System.out.println("!!!");
			}
		}.sleep();
		//������
		AbstractAnimal an1 =  new AbstractAnimal(){

			@Override
			public void eat() {
				// TODO Auto-generated method stub
				System.out.println("�ԳԳ�");
			}

			@Override
			public void sleep() {
				// TODO Auto-generated method stub
				System.out.println("˯˯˯");
			}
			
		};
		
		an1.eat();
		an1.sleep();
	}

}
