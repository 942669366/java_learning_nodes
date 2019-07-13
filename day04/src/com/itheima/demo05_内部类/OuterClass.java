package com.itheima.demo05_内部类;
//外部类
public class OuterClass {
	//成员内部类
	class InnerClass2{
		int b = 20;
	}
	
	public void show(){
		//局部内部类
		class InnerClass1{
			int a = 10;
			
		}
		//因为局部内部类 只能在局部使用
		InnerClass1 c1 = new InnerClass1();
		System.out.println(c1.a);
		
	}
	
	
	
	public void test(){
		//局部内部类 只能在类定义的局部区域使用
		//InnerClass1 c1 = new InnerClass1();
	}
	
	
	
}
