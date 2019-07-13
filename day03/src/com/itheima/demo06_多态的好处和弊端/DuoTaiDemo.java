package com.itheima.demo06_多态的好处和弊端;
/*
 * 结论:
 * 	 多态调用成员变量时,编译运行都看父类
 * 
 * 	多态调用成员方法时,编译看父类 运行看子类
 * 
 * 	弊端: 多态只能调用子父类共有的方法, 不能调用子类特有的
 * 
 *  好处:提高程序的灵活性
 *  		案例: 定义三个方法 喂狗,喂猫,喂猪,喂老虎
 *  	总结:
 *  		父类类型的变量,可以接收 任何一个子类的对象
 *  		调用方法的时候,编译是看父类,运行时运行的传递过来的子类对象中的方法
 *  			
 *  			
 *  		
 * 
 */
public class DuoTaiDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//喂猪
		Pig pp = new Pig();
		//feedPig(pp);
		feedAnimal(pp);
		//喂猫
		Cat cc = new Cat();
		//feedCat(cc);
		feedAnimal(cc);
		//喂狗
		Dog dd = new Dog();
		//feedDog(dd);
		feedAnimal(dd);
		//喂老虎
		Animal tt = new Tiger();
		feedAnimal(tt);
	}
	//喂动物
	public static void feedAnimal(Animal an){//Animal an = new Tiger();
		//Animal an = new Dog();
		//Animal an = new Cat();
		//Animal an = new Pig();;
		System.out.println("小宝贝,吃饭了");
		an.eat();
	}
	
/*	//喂猪:
	public static void feedPig(Pig p){
		System.out.println("小宝贝,吃饭啦...");
		p.eat();
	}
	//喂猫
	public static void feedCat(Cat cc){
		System.out.println("小宝贝,吃饭啦...");
		cc.eat();
	}
	//喂狗
	public static void feedDog(Dog dd){
		System.out.println("小宝贝,吃饭啦...");
		dd.eat();
	}*/

}
