package com.itheima.demo01_static�Ľ���;
/*
 * 1.static�Ľ���
 * 		static:�ؼ���,��̬��
 * 	static�������������������еĳ�Ա
 * 
 *  2.��ǰ����Ҫ����һ�����е�ĳһ����Ա����
 *  		��Ҫ�ȴ�������,��ͨ��������ó�Ա����
 *  
 *  3.���һ����ĳ�Ա����static������,��ô����������Ա
 *  		ֱ��ͨ������.��Ա����
 *  
 *  ����:
 *  	����һ����,CZStudent(����ѧ����)
 *  			��Ա: age,name,id,school(�Ͷ�ѧУ)
 *  	ʲôʱ����ĳ�Ա��Ҫ��static������?
 *  			��������Ա ��������ĳһ������,�����������ж����е�,��ô��Ҫ����static����
 *  ����:
 *  	����һ����,Chinese(�й�����)
 *  		��Ա:
 *  			age,name,job(����),nation(����)	
 *  
 *  �ܽ�:
 *  	1.���һ����ĳ�Ա��static������,��ô����? ����.��Ա������
 *  	2.ʲôʱ����Ҫ��static���γ�Ա����, ��Ա������ĳһ�������Լ���,�������ж������
 *  	3.��static���κ��Ա���ص�:
 *  		����.��Ա������(�Ƽ�)
 *  		����.��Ա������
 *  		
 * 		
 */
public class StaticDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��һ������
		Chinese ch1 = new Chinese();
		ch1.age = 18;
		ch1.job = "����";
		ch1.name = "����";
		//�޸�С���ܵĹ���
		ch1.nation = "С�׹��͹�";
		System.out.println(ch1.name+".."+ch1.nation);
		//�ڶ�������
		Chinese ch2 = new Chinese();
		ch2.age = 20;
		ch2.job = "��Ա";
		ch2.name = "jack.chen.";
		
		System.out.println(ch2.name+".."+ch2.nation);
		
		
	}
	//ûѧstatic֮ǰ�ķ��ʳ�Ա�����ķ�ʽ
	public static void test(){
		//��ǰ�����Dog�и�age
		//1.����Dog����
		Dog d = new Dog();
		//2.ͨ��Dog���� .��Ա����
		d.age = 10;
		System.out.println(d.age);
	}

}
