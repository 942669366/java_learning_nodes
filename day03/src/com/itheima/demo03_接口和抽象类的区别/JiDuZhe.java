package com.itheima.demo03_接口和抽象类的区别;
/*
 * 缉毒者接口:接口定义了缉毒者必须会方法
 */
public interface JiDuZhe {
	public abstract void jiDu();
	//要求 缉毒者必须会缉毒 而且要会开枪
	public abstract void biuBiuBiu();
}
