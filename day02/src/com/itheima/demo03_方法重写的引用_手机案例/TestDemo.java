package com.itheima.demo03_������д������_�ֻ�����;
/*
 * 
 * 3.������д������:
 * 		a.ΪʲôҪ���з�������д
 * 			������ ���� �Ӹ���̳й����ķ��� ������ʱ  ��ô������Ҫ�Լ�ȥ��д��Щ����
 * 		����:�ֻ�����
 * 		����:�ֻ���
 * 		����:���ܻ�
 * 
 * 4.ע������:
 * 		a.Ȩ������: ������д������Ȩ��>=�����з���Ȩ��
 * 			java��������Ȩ��:	�Ӵ�С
 * 				public protected default private
 * 		
 */
public class TestDemo {
	public static void main(String[] args) {
		//����:AndroidPhone
		AndroidPhone vivo9s = new AndroidPhone();
		vivo9s.brand = "vivo�����";
		vivo9s.price = 998.88;
		
		vivo9s.call();
		
		vivo9s.sendMsg();
		
	}
}
