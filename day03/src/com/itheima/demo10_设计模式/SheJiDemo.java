package com.itheima.demo10_���ģʽ;
/*
 *	ʲô�����ģʽ(35):
 *		ǰ���ǰ� �������ķ��� �ܽ��һ����·
 *
 *	1.�������ģʽ
 *		1.1 ��̬�������ģʽ
 *		1.2 ��̬�������ģʽ
 *
 *   ����: ��ɫ����(���⵳)
 *   	 С��  ��һ��Ů����  �ǳ��ÿ�  �ر��ͻ�,С������ ������    С������ ����ˮ  С�� ���� �� ��Ħ
 *   	С��:Boy
 *   		name
 *   		����: ����,����,����
 *   	Ů����:Girl
 *   		name
 *   		����: ����,����,��Ħ
 * 
 * 
 */


public class SheJiDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// С��  ��һ��Ů����  �ǳ��ÿ�  �ر��ͻ�,С������ ������    С������ ����ˮ  С�� ���� �� ��Ħ
		Boy xp = new Boy();
		xp.name = "С��";
		
		Girl xx = new Girl();
		xx.name = "Сϼ";
		
		Man mm = new Man();
		mm.name = "С��";
		
		Yao yy = new Yao();
		yy.name = "С��";
		
		//����֮��Ĺ�ϵ
		//xp.nvyou = xx;//�� xx ��Ϊ xp��nvyou
		//NvYouINterface nvyou = new Yao();
		//NvYouINterface nvyou = new Girl();
		//NvYouINterface nvyou = new Man();
		
		Dog dd = new Dog();
		xp.nvyou = dd;
		
		
		
		xp.hungry();
		
		xp.thirsty();
		
		xp.tired();
		
	}

}
