package com.itheima.dmeo07_案例补充;
/*
 * 武警类
 * 
 * 武警开坦克
 * 
 *  坦克去打飞机
 *  
 *  
 *  思考一个问题:
 *  	拿着锤头敲鸡蛋
 *  	开着坦克打飞机
 */
public class Soldier {
	String name;
	int level;//等级
	
	//开坦克打飞机
	public void driveTankAndFirePlane(Tank tk,Plane p){
		System.out.println(this.name+"开着"+tk.type+",准备去打飞机...");
		//打飞机
		tk.firePlane(p);
	}
}
