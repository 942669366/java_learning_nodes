package com.itheima.demo03_接口和抽象类的区别;

public class SuperPig extends AbstractPig implements JiDuZhe{

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("站着睡...");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("躺着吃烤肠....");
	}

	@Override
	public void jiDu() {
		// TODO Auto-generated method stub
		System.out.println("别跑,我跑不动了....");
	}

	@Override
	public void biuBiuBiu() {
		// TODO Auto-generated method stub
		
	}

}
