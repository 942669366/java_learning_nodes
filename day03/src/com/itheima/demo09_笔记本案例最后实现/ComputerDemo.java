package com.itheima.demo09_�ʼǱ��������ʵ��;
/*
 * 
 * ģ����� ʹ�� ����
 * 
 * ���е��ⲿ�豸  �����Ǽ��� ��� ����,����ͷ
 * 
 * �����ṩ��������  ��  �ر�  ʹ��
 * 
 * ���������б�Ҫ������������ ���ڽӿ��� 
 * 
 * �������ⲿ���ȥʵ������ӿ�
 * 
 * 
 * **** ��̬�ı�����ʽ:
 * 			1.�������� ������ = new ��������();
 * 			2.�ӿ�����  ������ = new ʵ����();
 * 				USBInteface mm =  new Mouse();
 * 				USBInteface bb = new KeyBoard();
 * 				USBInteface cc = new YInXiang();
 * 
 */
public class ComputerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���Ե��� ʹ�� ���
		Computer haier = new Computer();
		
		YinXiang yx = new YinXiang();
		Mouse mm = new Mouse();
		KeyBoard kb = new KeyBoard();
		Watch ww = new Watch();
		//����ʹ�����
		haier.start();
		
		haier.useUSB(ww);
		
		haier.end();
	}

}
