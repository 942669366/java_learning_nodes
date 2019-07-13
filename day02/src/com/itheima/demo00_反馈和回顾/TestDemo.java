package com.itheima.demo00_反馈和回顾;
/*
 * 类名作为方法的参数
 * 	 案例:杀人
 * 	总结:在调用方法时,我们需要传递的是 该类的对象,不是别类的对象也不是该类
 * 		
 * 
 * 
 * 类名作为方法的返回值:
 * 		案例:生孩子
 * 		实际上需要返回的是 该类的对象  不是该类,也不是别的类的对象
 * 
 * 
 * 
 */
public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//调用
		Person p = new Person();
		p.age = 18;
		p.name = "张三";
		/*Dog d = new Dog();
		d.name = "张三";*/
		killPerson(p);
		
		
		//=====
	/*	int a = 10;
		killInt(a);*/
		//调用
		Person p2 = newBaby();
		
		System.out.println(p2.age+"..."+p2.name);
	}
	//生孩子
	public static Person newBaby(){
		//返回一个孩子对象
		Person pp = new Person();
		pp.age = 3;
		pp.name = "哪吒";
		
		//返回这个孩子
		return pp;
		
	}
	
	
	//杀人方法
	public static void killPerson(Person person){//Person person = new Person()
		//怎么杀人
		System.out.println("给老子去死:"+person.name);
	}
/*	
	public static void killInt(int a){
		
	}
*/
}
