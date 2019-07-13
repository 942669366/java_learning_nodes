package com.itheima.demo03_方法重写的引用_手机案例;

public class AndroidPhone extends Phone {
	//重写 打电话方法
	protected void call(){
		/*//1000行代码
		System.out.println("正在给13838385438打电话...");
		*/
		super.call();
		//500行代码
		System.out.println("看见一张萌萌的脸...");
	}
	
	//重写 发短信
	//发短信
	public void sendMsg(){
		/*//500行代码
		System.out.println("小丽,晚上我们一块吃shi呗");*/
		super.sendMsg();
		//500行代码 发语言
		System.out.println("哈哈哈  粑粑真好吃~~~");
		//500行代码 发图片
		System.out.println("一张吃粑粑的图片,味道真好..");
		//500行代码 发视频
		System.out.println("发一个吃粑粑的视频...");
	}
}
