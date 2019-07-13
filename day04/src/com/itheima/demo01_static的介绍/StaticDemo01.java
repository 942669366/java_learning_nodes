package com.itheima.demo01_static的介绍;
/*
 * 1.static的介绍
 * 		static:关键字,静态的
 * 	static的作用是用来修饰类中的成员
 * 
 *  2.以前我们要访问一个类中的某一个成员变量
 *  		需要先创建对象,在通过对象调用成员变量
 *  
 *  3.如果一个类的成员变量static修饰了,那么想访问这个成员
 *  		直接通过类名.成员变量
 *  
 *  比如:
 *  	定义一个类,CZStudent(传智学生类)
 *  			成员: age,name,id,school(就读学校)
 *  	什么时候类的成员需要用static修饰呢?
 *  			如果这个成员 他不属于某一个对象,而是属于所有对象共有的,那么需要加上static修饰
 *  比如:
 *  	定义一个类,Chinese(中国人类)
 *  		成员:
 *  			age,name,job(工作),nation(国籍)	
 *  
 *  总结:
 *  	1.如果一个类的成员被static修饰了,怎么访问? 类名.成员变量名
 *  	2.什么时候需要用static修饰成员变量, 成员变量是某一个对象自己的,还是所有对象共享的
 *  	3.被static修饰后成员的特点:
 *  		类名.成员变量名(推荐)
 *  		对象.成员变量名
 *  		
 * 		
 */
public class StaticDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//第一个对象
		Chinese ch1 = new Chinese();
		ch1.age = 18;
		ch1.job = "歌手";
		ch1.name = "周周";
		//修改小周周的国籍
		ch1.nation = "小米共和国";
		System.out.println(ch1.name+".."+ch1.nation);
		//第二个对象
		Chinese ch2 = new Chinese();
		ch2.age = 20;
		ch2.job = "演员";
		ch2.name = "jack.chen.";
		
		System.out.println(ch2.name+".."+ch2.nation);
		
		
	}
	//没学static之前的访问成员变量的方式
	public static void test(){
		//以前想访问Dog中个age
		//1.创建Dog对象
		Dog d = new Dog();
		//2.通过Dog对象 .成员变量
		d.age = 10;
		System.out.println(d.age);
	}

}
