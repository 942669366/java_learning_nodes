package com.itheima.dmeo07_案例补充;
/*
 * 什么是面向对象
 * 		核心理念,谁的功能谁负责
 * 
 * 案例:
 * 		武警开坦克打飞机
 * 		战士拿着枪打鬼子
 * 		小偷拿着青龙偃月刀去撬门
 * 
 * 分析:
 * 	1.名词提炼
 * 		武警:Soldier
 * 		坦克:Tank
 * 		飞机:Plane
 * 	2.设计类
 * 		Solider: 
 * 			成员变量:name,level
 * 			成员方法:开坦克
 * 		Tank:
 * 			成员变量:type
 * 			成员方法:打飞机
 * 		Plane:
 * 			成员变量:type
 * 			成员方法:爆炸
 *  3.实现
 *  	
 *  	
 * 
 */
public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//测试
		Soldier s1 = new Soldier();
		s1.name = "许三多";
		
		Tank tk = new Tank();
		tk.type = "天启坦克";
		
		Plane p = new Plane();
		p.type = "歼-20战斗机";
		
		
		s1.driveTankAndFirePlane(tk, p);
		
	}

}
