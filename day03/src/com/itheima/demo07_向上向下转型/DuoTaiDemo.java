package com.itheima.demo07_��������ת��;
/*
 * 
 * ��̬�ı׶�:
 * 		���ܵ����������еķ���
 * 
 * 
 * �׶˵Ľ������:
 * 		����ת��: ǿ������ת�� int a = (int)3.14;
 * 
 * 		����ת��(���Ƕ�̬):	�Զ�����ת�� double d = 10;
 * 			Animal an = new Dog();
 * 
 * ����ת��Ҳ�б׶�:
 * 		�Ѹ���ı��� ת���������͵�ʱ�� ������ֱ�ӱ���ͨ��
 * 
 * java�н������ת�ͱ׶˵ķ���:
 * 		һ���ؼ��� instanceof ����� 
 * 
 * 		����: �ж�ĳһ������ ���� ���������
 * 		��ʽ:
 * 			boolean b = an instanceof ����
 * 
 * �ܽ�:
 * 		��̬�ĺô�:��߳���������,��չ��,������
 * 				��Ϊ����ı���  ���Խ����κ�һ���������
 * 		��̬�ı׶�:
 * 				���ܵ����������еķ���
 * 		��������ת��:
 * 			����ת��: ��̬
 * 			����ת��: �������� ������ =(��������)�������͵ı���;
 * 					������.�������з���();
 * 		����ת�͹����� �����׳���  ����ת�����쳣 Cat can not be cast to DOg
 * 		�ؼ���:����� instanceof
 * 			�ж�ĳһ������ �ǲ�������һ����
 * 			��ʽ:
 * 				 boolean b = ������ instanceof ����
 * 	
 * 				
 */
public class DuoTaiDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal an = new Cat();
	
		//ʹ��instanceof����� �����ж�
		boolean b = an instanceof  Dog;
		if(b){
			Dog dd = (Dog)an;
			dd.lookHome();
		}
		boolean b1 = an instanceof  Cat;
		if(b1){
			Cat c = (Cat)an;
			c.catchMouse();
		}
		
	}
	public static void test(){
		//������ ʹ�ö�̬
		Animal an = new Dog();
		an.eat();
		//Dog cannot be cast to Cat ������ת��è
		Cat cc = (Cat)an;//���߱����� an��è
		cc.catchMouse();
		
//		an.lookHome();
//		Dog d = (Dog)an;
//		d.lookHome();
//		//����è ʹ�ö�̬
//		Animal an1 = new Cat();
//		an1.eat();
//		Cat cc = (Cat)an1;
//		
//		cc.catchMouse();
	}
}
