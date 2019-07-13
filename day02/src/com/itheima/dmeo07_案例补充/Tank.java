package com.itheima.dmeo07_案例补充;
/*
 * 坦克类
 */
public class Tank {
	String type;//种类
	
	//打飞机
	public void firePlane(Plane p){
		System.out.println(type+",发出一个个泡蛋,射向远方的"+p.type+".....");
		p.boom();
	}
}
