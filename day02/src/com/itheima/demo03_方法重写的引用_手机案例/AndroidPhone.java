package com.itheima.demo03_������д������_�ֻ�����;

public class AndroidPhone extends Phone {
	//��д ��绰����
	protected void call(){
		/*//1000�д���
		System.out.println("���ڸ�13838385438��绰...");
		*/
		super.call();
		//500�д���
		System.out.println("����һ�����ȵ���...");
	}
	
	//��д ������
	//������
	public void sendMsg(){
		/*//500�д���
		System.out.println("С��,��������һ���shi��");*/
		super.sendMsg();
		//500�д��� ������
		System.out.println("������  ������ó�~~~");
		//500�д��� ��ͼƬ
		System.out.println("һ�ų����ε�ͼƬ,ζ�����..");
		//500�д��� ����Ƶ
		System.out.println("��һ�������ε���Ƶ...");
	}
}
