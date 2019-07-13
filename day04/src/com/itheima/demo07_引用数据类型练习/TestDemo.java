package com.itheima.demo07_引用数据类型练习;
/*
 * 1.类作为方法的参数或者返回值
 * 			我们需要传递的或者返回的,应该该类的对象(不是该类,也不是别的类的对象)
 * 	
 * 
 *  2.抽象类 作为方法的参数和返回值
 *  		我们需要传递的或者返回的,该抽象类的子类的对象
 *  
 *  3.接口作为方法参数和返回值
 *  		我们需要传递的或者返回的,该接口的实现类的对象
 *  		
 */
public class TestDemo {
	public static void main(String[] args) {
		//测试杀人方法
//		Person p1 = new Person(18,"老王");
		//killPerson(new Person(18, "老王"));
		//测试生孩子方法
		//Person p =  getPerson();
		//System.out.println(p.age+".."+p.name);
		//测试杀动物方法
		/*Animal an = new Animal(){

			@Override
			public void eat() {
				// TODO Auto-generated method stub
				System.out.println("Animal的子类吃");
			}
			
		};*/
		killAnimal(new Animal(){

			@Override
			public void eat() {
				// TODO Auto-generated method stub
				System.out.println("吃吃");
			}
			
		});
	}
	//生动物
	public static Animal getAnimal(){
		//1.创建动物的子类对象
		/*Animal an = new Animal(){
			@Override
			public void eat() {
				// TODO Auto-generated method stub
				
			}
		};
		return an;*/
		//直接返回抽象的子类对象
		return  new Animal() {
			
			@Override
			public void eat() {
				// TODO Auto-generated method stub
				
			}
		};
	}
	//杀动物
	public static void killAnimal(Animal an){
		an.eat();
		System.out.println("杀动物");
	}
	
	//杀人
	public static void killPerson(Person p){
		System.out.println("去屎吧.."+p.name);
	}
	//生孩子
	public static Person getPerson(){
		//1.创建一个孩子
//		Person pp = new Person(0,"小卑鄙");
		//2.返回这个孩子
		return new Person(0,"小北鼻");
	}
}
