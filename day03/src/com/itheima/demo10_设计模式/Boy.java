package com.itheima.demo10_设计模式;

public class Boy {
	String name;//有一个名字
	NvYouIntetface nvyou;//有一个女友
	//饿了
	public void hungry(){
		System.out.println("本大爷饿了,还不去做饭...");
		nvyou.cook();
	}
	//渴了
	public void thirsty(){
		System.out.println("寡人渴了,去倒茶啊,不长眼力劲...");
		nvyou.daoShui();
	}
	//累了
	public void tired(){
		System.out.println("朕类了,赶紧过来按摩...");
		nvyou.moMo();
	}
}
