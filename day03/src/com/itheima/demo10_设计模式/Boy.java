package com.itheima.demo10_���ģʽ;

public class Boy {
	String name;//��һ������
	NvYouIntetface nvyou;//��һ��Ů��
	//����
	public void hungry(){
		System.out.println("����ү����,����ȥ����...");
		nvyou.cook();
	}
	//����
	public void thirsty(){
		System.out.println("���˿���,ȥ���谡,����������...");
		nvyou.daoShui();
	}
	//����
	public void tired(){
		System.out.println("������,�Ͻ�������Ħ...");
		nvyou.moMo();
	}
}
