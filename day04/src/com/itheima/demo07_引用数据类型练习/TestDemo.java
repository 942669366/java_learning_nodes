package com.itheima.demo07_��������������ϰ;
/*
 * 1.����Ϊ�����Ĳ������߷���ֵ
 * 			������Ҫ���ݵĻ��߷��ص�,Ӧ�ø���Ķ���(���Ǹ���,Ҳ���Ǳ����Ķ���)
 * 	
 * 
 *  2.������ ��Ϊ�����Ĳ����ͷ���ֵ
 *  		������Ҫ���ݵĻ��߷��ص�,�ó����������Ķ���
 *  
 *  3.�ӿ���Ϊ���������ͷ���ֵ
 *  		������Ҫ���ݵĻ��߷��ص�,�ýӿڵ�ʵ����Ķ���
 *  		
 */
public class TestDemo {
	public static void main(String[] args) {
		//����ɱ�˷���
//		Person p1 = new Person(18,"����");
		//killPerson(new Person(18, "����"));
		//���������ӷ���
		//Person p =  getPerson();
		//System.out.println(p.age+".."+p.name);
		//����ɱ���﷽��
		/*Animal an = new Animal(){

			@Override
			public void eat() {
				// TODO Auto-generated method stub
				System.out.println("Animal�������");
			}
			
		};*/
		killAnimal(new Animal(){

			@Override
			public void eat() {
				// TODO Auto-generated method stub
				System.out.println("�Գ�");
			}
			
		});
	}
	//������
	public static Animal getAnimal(){
		//1.����������������
		/*Animal an = new Animal(){
			@Override
			public void eat() {
				// TODO Auto-generated method stub
				
			}
		};
		return an;*/
		//ֱ�ӷ��س�����������
		return  new Animal() {
			
			@Override
			public void eat() {
				// TODO Auto-generated method stub
				
			}
		};
	}
	//ɱ����
	public static void killAnimal(Animal an){
		an.eat();
		System.out.println("ɱ����");
	}
	
	//ɱ��
	public static void killPerson(Person p){
		System.out.println("ȥʺ��.."+p.name);
	}
	//������
	public static Person getPerson(){
		//1.����һ������
//		Person pp = new Person(0,"С����");
		//2.�����������
		return new Person(0,"С����");
	}
}
