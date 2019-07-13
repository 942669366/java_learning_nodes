package com.itheima.demo03_接口和抽象类的区别;

public class SuperDog extends AbstractDog implements JiDuZhe{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("3秒钟必须吃饭....");
	}

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("站住,不让我咬你....");
	}

	@Override
	public void jiDu() {
		// TODO Auto-generated method stub
		System.out.println("站住,不让我开枪了...");
	}

	@Override
	public void biuBiuBiu() {
		// TODO Auto-generated method stub
		
	}

}
