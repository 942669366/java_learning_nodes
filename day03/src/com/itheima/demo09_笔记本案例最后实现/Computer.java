package com.itheima.demo09_�ʼǱ��������ʵ��;

public class Computer {
	//�Լ���
	public void start(){
		System.out.println("���Կ�����...");
	}
	
	//ʹ��USB�豸
	public void useUSB(USBInteface usb){
		//USBinterface usb =  new YinXiang();
		//USBinterface usb =  new Mouse();
		//USBinterface usb =  new KeyBoard();
		usb.open();
		usb.use();
		usb.close();
	}
	
	
	public void end(){
		System.out.println("���Թػ���...");
	}
	
}
