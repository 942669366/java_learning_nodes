package com.itheima.demo00_��ϰ;

/*
 * 1.this��super
 * 	this:
 * 	super:
 * 2.�ڴ�ͼ
 * 	
 * 3.��������д
 * 
 * 4.������(abstract class)
 * 		��abstract���ε���
 * 
 * 5.����
 */
public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C cc = new C();
		cc.printAA();
	}

}

class A {
	int aa = 10;
}

class B extends A {
	int bb = 20;
	/*public void show(){
		super.aa
	}*/
}

class C extends B {
	 int cc = 30;
	public void printAA() {
		System.out.println(super.bb);
	}
}