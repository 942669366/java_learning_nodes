package com.itheima.demo05_�̳�;
/*
 * *****�̳�: ��������������ص�,��װ,�̳�,��̬
 * 		1.��ʵ�����еļ̳�:
 * 				�� �̳� �����Ų��Ĺ���
 * 		2.java�еļ̳�:��������֮��Ĺ�ϵ
 * 				һ����(����/������/sub)  ���� �̳� ����һ����(����/����/����/super),����������ǳ�Ϊjava�м̳�
 * 
 * 		3.�̳���ôд?
 * 			public class ����  extends ����{
 * 			
 * 
 * 			}
 * 		4.�������̳��˸���,��ô������Զ�ӵ�и��������еĳ�Ա(����private����,��������private���γ�Ա���಻��ֱ���ù�����)
 * 			
 * 		5.�̳е�����:
 * 			��ߵĴ���ĸ�����
 * 	
 * 
 * 
 */
public class ExtendsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�������Ǹոն��弸����
		Teacher xiaopeng = new Teacher();
		xiaopeng.age = 19;
		xiaopeng.id = 10086;
		xiaopeng.name ="������";
		xiaopeng.work();
		
		//=============
		HelpTeacher xiaohong = new HelpTeacher();
		xiaohong.age = 18;
		xiaohong.work();
		//===========
		BanTeacher xiaoxia = new BanTeacher();
		
		xiaoxia.id = 10010;
		xiaoxia.work();
		
		
		
	}

}
