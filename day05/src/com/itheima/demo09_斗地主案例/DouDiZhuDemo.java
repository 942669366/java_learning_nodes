package com.itheima.demo09_斗地主案例;

import java.util.ArrayList;
import java.util.Collections;

/*
 * 鏂楀湴涓绘渚嬪疄鐜版楠�:
 * 
 * 1.鐢熸垚涓�鍓墝(54),54涓瓧绗︿覆,淇濆瓨鍒伴泦鍚堜腑
 * 
 * 
 * 2.娲楃墝(鎵撲贡闆嗗悎涓厓绱犵殑椤哄簭)
 * 
 * 
 * 3.鍙戠墝(杞祦鍙�)
 * 
 * 
 * 4.鐪嬬墝(鎵撳嵃闆嗗悎涓厓绱�)
 * 
 * ================
 * 
 * 5.鎶㈠湴涓�.....
 * 
 */
public class DouDiZhuDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.鐢熸垚涓�鍓墝
		ArrayList<String> cards = new ArrayList<String>();
		//姣忎竴寮� 鐨勮姳鑹�:鈾� 鈾� 鈾� 鈾�
		//姣忎竴寮犵殑鏁板��: A 2 3 ... 10 J Q K
		String[] colors = {"鈾�","鈾�","鈾�","鈾�"};
		String[] nums = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		for (String num : nums) {
			for (String color : colors) {
				//缁勫悎:color 鍜� num
				String card = color+num;
				cards.add(card);
			}
		}
		//娣诲姞澶у皬鐜�
		cards.add("灏廠");
		cards.add("澶");
		//2.娲楃墝,Collections鍙仛闆嗗悎宸ュ叿绫�
		Collections.shuffle(cards);
		//3.鍙戠墝
		//瀹氫箟涓変釜鐜╁闆嗗悎.瀛樺偍鍚勮嚜鐨勭墝
		ArrayList<String> p1 = new ArrayList<String>();
		ArrayList<String> p2 = new ArrayList<String>();
		ArrayList<String> p3 = new ArrayList<String>();
		ArrayList<String> dp = new ArrayList<String>();
		//寰幆鍙栧嚭cards闆嗗悎涓殑鐗� 渚濇淇濆瓨鍒颁笁涓泦鍚堜腑
		for (int i = 0; i < cards.size(); i++) {
			String card = cards.get(i);
			// i=0 ==>p1
			// i=1 ==>p2
			// i=2 ==>p3
			// i=3 ==>p2
			// i=53 52 51
			if(i>=51){
				dp.add(card);
			}else{
				if(i%3 == 0){
						p1.add(card);
					}else if(i%3 == 1){
						p2.add(card);
					}else{
						p3.add(card);
				}
			}
			
		}
		
		//4.鐪嬬墝
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(dp);
		
		
	}

}
