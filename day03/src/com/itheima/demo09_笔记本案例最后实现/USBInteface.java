package com.itheima.demo09_笔记本案例最后实现;
/*
 * USB外部设备的必要要有的方法,必须要遵从的规范
 */
public interface USBInteface {
	public abstract void open();
	public abstract void use();
	public abstract void close();
	
}
