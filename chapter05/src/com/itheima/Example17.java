package com.itheima;
public class Example17 {
    public static void main(String args[]) {
		// 定义一个基本类型的变量a,并赋值为20
		int a = 20;
		// 自动装箱：将基本类型的变量a赋给Integer类型的变量b
		Integer b = a;
		System.out.println(b);
		// 自动拆箱：将Integer类型的变量b赋给基本类型的变量a
		int c = b;
		System.out.println(c);
	}
}


