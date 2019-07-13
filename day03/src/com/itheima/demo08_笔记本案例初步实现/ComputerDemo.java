package com.itheima.demo08_笔记本案例初步实现;
/*
 * 
 * 模拟电脑 使用 鼠标
 */
public class ComputerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//测试电脑 使用 鼠标
		Computer haier = new Computer();
		
		Mouse ls = new Mouse();
		//电脑使用鼠标
		haier.start();
		
		haier.useMouse(ls);
		
		haier.end();
	}

}
