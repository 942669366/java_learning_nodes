package com.itheima.demo01_static�Ľ���;
/*
 * ��static���εĳ�Ա����/��Ա������ʹ��
 * 
 * 1.����ֱ������������
 * 		����.��̬��Ա������
 * 		����.��̬��Ա������(����);
 * 		Ҳ����ͨ������,�ǲ�����
 * 
 */
public class StaticDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����Demo��ľ�̬�ͷǾ�̬��Ա
		//1.�Ǿ�̬,�����ж���
		Demo dd = new Demo();
		dd.a = 10;
		dd.show();
		//2��̬,����ͨ������,���ǽ���ͨ������
		dd.d = 3.14;
		dd.test();
		//������һ�·�ʽ
		Demo.d = 1.11;
		Demo.test();
		
		
	}

}
