package com.itheima.demo10_设计模式;
/*
 *	什么叫设计模式(35):
 *		前辈们把 解决问题的方案 总结出一个套路
 *
 *	1.代理设计模式
 *		1.1 静态代理设计模式
 *		1.2 动态代理设计模式
 *
 *   案例: 绝色佳人(标题党)
 *   	 小鹏  有一个女朋友  非常好看  特别贤惠,小鹏饿了 给做饭    小鹏渴了 给倒水  小鹏 累了 给 按摩
 *   	小鹏:Boy
 *   		name
 *   		方法: 饿了,渴了,累了
 *   	女朋友:Girl
 *   		name
 *   		方法: 做饭,倒茶,按摩
 * 
 * 
 */


public class SheJiDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 小鹏  有一个女朋友  非常好看  特别贤惠,小鹏饿了 给做饭    小鹏渴了 给倒水  小鹏 累了 给 按摩
		Boy xp = new Boy();
		xp.name = "小鹏";
		
		Girl xx = new Girl();
		xx.name = "小霞";
		
		Man mm = new Man();
		mm.name = "小明";
		
		Yao yy = new Yao();
		yy.name = "小青";
		
		//他们之间的关系
		//xp.nvyou = xx;//让 xx 做为 xp的nvyou
		//NvYouINterface nvyou = new Yao();
		//NvYouINterface nvyou = new Girl();
		//NvYouINterface nvyou = new Man();
		
		Dog dd = new Dog();
		xp.nvyou = dd;
		
		
		
		xp.hungry();
		
		xp.thirsty();
		
		xp.tired();
		
	}

}
