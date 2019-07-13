package com.itheima.demo04_匿名对象;

import com.itheima.demo02.Dog;

/*
 * 匿名对象:(可用可不用)
 * 		匿名对象:没有名字的对象
 * 		语法上: 只创建对象,但是不用变量来接收
 * 		匿名对象的使用:
 * 			1.匿名对象也是一个对象,具有对象的所有功能
 * 			2.匿名对象的特点:
 * 				每一次使用匿名对象时,都是一个新的对象
 * 				结论:一个匿名对象,只能使用一次
 * 			3.匿名对象只能用一次
 * 
 * 				
 * 			
 * 				
 * 	
 */
public class NiMingObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.非匿名对象(正常的对象)
		Dog d = new Dog();
		
		d.setAge(10);
		d.setName("来福");
		
		//d.eat();
		System.out.println(d.getAge()+"..."+d.getName());
		
		//2.匿名对象
		new Dog();
		
		//3.匿名对象的使用
		new Dog().setAge(18);
		new Dog().setName("旺财");
		
		System.out.println(new Dog().getAge()+"..."+new Dog().getName());
		//new Dog().eat();
	}

}
