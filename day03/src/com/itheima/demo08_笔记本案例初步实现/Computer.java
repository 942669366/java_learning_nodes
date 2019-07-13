package com.itheima.demo08_笔记本案例初步实现;

public class Computer {
	//自己的
	public void start(){
		System.out.println("电脑开机了...");
	}
	//使用鼠标
	public void useMouse(Mouse mm){
		//
		mm.open();
		mm.use();
		mm.close();
	}
	public void end(){
		System.out.println("电脑关机了...");
	}
	
}
