package com.itheima.demo07_������E�ĺ���;

public interface MyInter<Q> {
	public abstract void show(Q q);
}

//1.������ʵ�ֽӿڵ�ʱ��,ȷ���ӿ��ϵķ���
class MyClass1 implements MyInter<String>{

	@Override
	public void show(String q) {
		// TODO Auto-generated method stub
		
	}
	
}
//2.������ʵ�ֽӿڵ�ʱ��,���ǲ�ȷ������,�ѽӿڵķ��ͼ���ʵ������
// ��ʵ���ഴ�������ʱ��ȷ��
class MyClass2<Q> implements MyInter<Q>{

	@Override
	public void show(Q q) {
		// TODO Auto-generated method stub
		
	}
	
}
