package com.itheima.demo09_笔记本案例最后实现;

public class Computer {
	//自己的
	public void start(){
		System.out.println("电脑开机了...");
	}
	
	//使用USB设备
	public void useUSB(USBInteface usb){
		//USBinterface usb =  new YinXiang();
		//USBinterface usb =  new Mouse();
		//USBinterface usb =  new KeyBoard();
		usb.open();
		usb.use();
		usb.close();
	}
	
	
	public void end(){
		System.out.println("电脑关机了...");
	}
	
}
