package com.itheima.demo07_������E�ĺ���;

public class Person<E> {
	E aaa;

	public E getAaa() {
		return aaa;
	}

	public void setAaa(E aaa) {//ʹ������ķ��͵ķ���
		this.aaa = aaa;
	}
	
	public <T> void show(T t){//���ͷ���
		System.out.println(t);
	}
	
}
