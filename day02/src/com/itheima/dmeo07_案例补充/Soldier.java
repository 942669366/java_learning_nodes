package com.itheima.dmeo07_��������;
/*
 * �侯��
 * 
 * �侯��̹��
 * 
 *  ̹��ȥ��ɻ�
 *  
 *  
 *  ˼��һ������:
 *  	���Ŵ�ͷ�ü���
 *  	����̹�˴�ɻ�
 */
public class Soldier {
	String name;
	int level;//�ȼ�
	
	//��̹�˴�ɻ�
	public void driveTankAndFirePlane(Tank tk,Plane p){
		System.out.println(this.name+"����"+tk.type+",׼��ȥ��ɻ�...");
		//��ɻ�
		tk.firePlane(p);
	}
}
