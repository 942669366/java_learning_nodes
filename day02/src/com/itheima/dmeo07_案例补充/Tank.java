package com.itheima.dmeo07_��������;
/*
 * ̹����
 */
public class Tank {
	String type;//����
	
	//��ɻ�
	public void firePlane(Plane p){
		System.out.println(type+",����һ�����ݵ�,����Զ����"+p.type+".....");
		p.boom();
	}
}
