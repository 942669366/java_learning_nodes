package com.itheima.dmeo07_��������;
/*
 * ʲô���������
 * 		��������,˭�Ĺ���˭����
 * 
 * ����:
 * 		�侯��̹�˴�ɻ�
 * 		սʿ����ǹ�����
 * 		С͵�����������µ�ȥ����
 * 
 * ����:
 * 	1.��������
 * 		�侯:Soldier
 * 		̹��:Tank
 * 		�ɻ�:Plane
 * 	2.�����
 * 		Solider: 
 * 			��Ա����:name,level
 * 			��Ա����:��̹��
 * 		Tank:
 * 			��Ա����:type
 * 			��Ա����:��ɻ�
 * 		Plane:
 * 			��Ա����:type
 * 			��Ա����:��ը
 *  3.ʵ��
 *  	
 *  	
 * 
 */
public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����
		Soldier s1 = new Soldier();
		s1.name = "������";
		
		Tank tk = new Tank();
		tk.type = "����̹��";
		
		Plane p = new Plane();
		p.type = "��-20ս����";
		
		
		s1.driveTankAndFirePlane(tk, p);
		
	}

}
