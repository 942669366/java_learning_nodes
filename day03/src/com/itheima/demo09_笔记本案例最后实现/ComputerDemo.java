package com.itheima.demo09_笔记本案例最后实现;
/*
 * 
 * 模拟电脑 使用 键盘
 * 
 * 所有的外部设备  不管是键盘 鼠标 音响,摄像头
 * 
 * 必须提供三个方法  打开  关闭  使用
 * 
 * 所以我们有必要把这三个方法 放在接口中 
 * 
 * 让所有外部设计去实现这个接口
 * 
 * 
 * **** 多态的表现形式:
 * 			1.父类类型 变量名 = new 子类类型();
 * 			2.接口类型  变量名 = new 实现类();
 * 				USBInteface mm =  new Mouse();
 * 				USBInteface bb = new KeyBoard();
 * 				USBInteface cc = new YInXiang();
 * 
 */
public class ComputerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//测试电脑 使用 鼠标
		Computer haier = new Computer();
		
		YinXiang yx = new YinXiang();
		Mouse mm = new Mouse();
		KeyBoard kb = new KeyBoard();
		Watch ww = new Watch();
		//电脑使用鼠标
		haier.start();
		
		haier.useUSB(ww);
		
		haier.end();
	}

}
