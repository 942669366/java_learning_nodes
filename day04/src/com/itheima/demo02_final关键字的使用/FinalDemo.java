package com.itheima.demo02_final�ؼ��ֵ�ʹ��;
/*
 * final:���յ�,�ռ���   �ڿ�-->(���,����)  ��ӥ����
 * 
 * final��������
 * 		��,��Ա����,��Ա����,�ֲ�����(��������,��������)
 * 
 * 1.final������(̫����): ���ܱ��̳�, ���ǲ����ǲ�����Ϊ�����������
 * 
 * 2.final���γ�Ա����:
 * 		2.1��final���εĳ�Ա����,�����ڴ�������֮ǰ��ȷ����ֵ
 * 		2.2��final���εĳ�Ա����,ֻ�ܸ�ֵһ��
 * 
 * 3.final���γ�Ա����(ţ�Ʒ���):
 * 		���ܱ�������д
 * 
 * 4.final���λ������;ֲ�����:
 * 		��final���εĻ������;ֲ����� ֻ�ܸ�ֵһ��
 * 5.final�����������͵ľֲ�����
 * 		��final���ε��������;ֲ����� ֻ�ܸ�ֵһ��
 * 		��������������ָ��Ķ����������ǿ��Ըı��
 * 		
 * 		
 * 
 * 
 */
public class FinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.ʹ��final���ε�����
		Test tt = new Test();
		//tt.aa = 10;
		//System.out.println(tt.aa);
		//2ʹ��final���λ�������
		final int a;
		a = 20;
		//a = 30;
		//3ʹ��final������������
		final Dog dd = new Dog();
		//dd = new Dog();
		dd.age = 20;
		dd.age = 30;
		
	}

}
