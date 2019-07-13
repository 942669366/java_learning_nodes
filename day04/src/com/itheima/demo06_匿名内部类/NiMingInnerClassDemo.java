package com.itheima.demo06_匿名内部类;
/*
 * 匿名内部类:
 * 		是一种特殊的语法,用来快速创建抽象类的子类对象
 * 					 用来快速创建  接口的实现类对象
 * 		
 * 不用匿名内部类:
 * 		给你一个抽象类,要求创建该类的子类对象
 * 		1.创建子类,继承抽象类
 * 		2.重写抽象类中的所有抽象方法
 * 		3.new 子类对象
 * 		给你一个接口,要求创建该接口的实现类对象
 * 		1.创建实现类 implments 接口
 * 		2.重写接口中所有的抽象方法
 * 		3.new 实现类对象
 * 
 */
public class NiMingInnerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3.new 子类对象
		Dog d = new Dog();
		d.eat();
		d.sleep();
		
	}
	//匿名内部类 快速创建接口的实现类对象
	public static void test02(){
		//第一种
		new NvYouInterface(){
			@Override
			public void cook() {
			}

			@Override
			public void daoShui() {
			}

			@Override
			public void moMo() {
			}
		};
		//第二种
		new NvYouInterface() {
			
			@Override
			public void moMo() {
				// TODO Auto-generated method stub
				System.out.println("摸摸...");
			}
			
			@Override
			public void daoShui() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void cook() {
				// TODO Auto-generated method stub
				
			}
		}.moMo();
		//第三种
		NvYouInterface ni = new NvYouInterface() {
			
			@Override
			public void moMo() {
				// TODO Auto-generated method stub
				System.out.println("摸摸");
			}
			
			@Override
			public void daoShui() {
				// TODO Auto-generated method stub
				System.out.println("倒水");
			}
			
			@Override
			public void cook() {
				// TODO Auto-generated method stub
				
			}
		};
		//调用方法
		ni.cook();
		ni.daoShui();
		ni.moMo();;
	}
	
	//匿名内部类 快速创建抽象类的子类对象
	public static void test01(){
		//使用匿名内部类快速 创建 AbstractAnimal抽象类的子类对象
		//第一种方式
		new AbstractAnimal(){

			@Override
			public void eat() {
				// TODO Auto-generated method stub
				System.out.println("吃");
			}

			@Override
			public void sleep() {
				// TODO Auto-generated method stub
				System.out.println("睡");
			}
			
			
		};
		//第二种
		new AbstractAnimal(){
			@Override
			public void eat() {
				// TODO Auto-generated method stub
				System.out.println(".....");
			}
			@Override
			public void sleep() {
				// TODO Auto-generated method stub
				System.out.println("!!!");
			}
		}.sleep();
		//第三种
		AbstractAnimal an1 =  new AbstractAnimal(){

			@Override
			public void eat() {
				// TODO Auto-generated method stub
				System.out.println("吃吃吃");
			}

			@Override
			public void sleep() {
				// TODO Auto-generated method stub
				System.out.println("睡睡睡");
			}
			
		};
		
		an1.eat();
		an1.sleep();
	}

}
