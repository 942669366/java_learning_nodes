package com.itheima.demo08_�ʼǱ���������ʵ��;
/*
 * 
 * ģ����� ʹ�� ���
 */
public class ComputerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���Ե��� ʹ�� ���
		Computer haier = new Computer();
		
		Mouse ls = new Mouse();
		//����ʹ�����
		haier.start();
		
		haier.useMouse(ls);
		
		haier.end();
	}

}
