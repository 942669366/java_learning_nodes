package com.itheima.demo06_哈希值结构;

import java.util.HashSet;

/*
 * 哈希表结构：
 * 			数组结构+链表结构的组合，查询，增删快
 * HashSet:采用哈希表结构
 * 
 * LinkedHashSet:采用链表+哈希表结构
 * 
 * Set集合中有三个特点：
 * 			1、无下标，2、无序(LinkedhashSet和TreeSet除外)3、不能重复
 * 哈希表结构，判断元素是否重复的原理
 * 
 * 1、先判断 新元素的哈希值 和所有旧元素的哈希值是否相同
 * 			如果都不相同，直接判断不重复，添加
 * 2、在调用 新元素 和 哈希值相同的旧元素的equals方法
 * 			如果返回的是true 判断重复元素，不添加
 * 			如果返回是false 判断为不重复元素，添加
 * 总结：	
 * 			只有哈希值相同，并且equals返回，才判定重复
 * 
 */
public class HashCodeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		hs.add("java");
		hs.add("abc");
		hs.add("php");
		hs.add("asd");
		hs.add("abc");
		hs.add("重地");
		hs.add("通话");
		hs.add("javaee");
		System.out.println(hs);
	}

}
