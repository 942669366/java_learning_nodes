package com.itheima.demo09_�ʼǱ��������ʵ��;

public class Watch implements USBInteface{

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("�ֱ���...");
	}

	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("�ֱ������..");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("�ֱ����...");
	}

}
