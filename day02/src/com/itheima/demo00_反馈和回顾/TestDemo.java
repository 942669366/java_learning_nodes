package com.itheima.demo00_�����ͻع�;
/*
 * ������Ϊ�����Ĳ���
 * 	 ����:ɱ��
 * 	�ܽ�:�ڵ��÷���ʱ,������Ҫ���ݵ��� ����Ķ���,���Ǳ���Ķ���Ҳ���Ǹ���
 * 		
 * 
 * 
 * ������Ϊ�����ķ���ֵ:
 * 		����:������
 * 		ʵ������Ҫ���ص��� ����Ķ���  ���Ǹ���,Ҳ���Ǳ����Ķ���
 * 
 * 
 * 
 */
public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����
		Person p = new Person();
		p.age = 18;
		p.name = "����";
		/*Dog d = new Dog();
		d.name = "����";*/
		killPerson(p);
		
		
		//=====
	/*	int a = 10;
		killInt(a);*/
		//����
		Person p2 = newBaby();
		
		System.out.println(p2.age+"..."+p2.name);
	}
	//������
	public static Person newBaby(){
		//����һ�����Ӷ���
		Person pp = new Person();
		pp.age = 3;
		pp.name = "��߸";
		
		//�����������
		return pp;
		
	}
	
	
	//ɱ�˷���
	public static void killPerson(Person person){//Person person = new Person()
		//��ôɱ��
		System.out.println("������ȥ��:"+person.name);
	}
/*	
	public static void killInt(int a){
		
	}
*/
}
