package com.itheima;
public class Example05 {
	public static void main(String[] args) {
		String s1 = " Starter"; // ����һ���ַ���
		String s2 = "St";
		System.out.println("�ж��Ƿ����ַ���St��ͷ:" + s1.startsWith("St"));
		System.out.println("�ж��Ƿ����ַ���er��β:" + s1.endsWith("er"));
		System.out.println("�ж��Ƿ�����ַ���ar:" + s1.contains("ar"));
		System.out.println("�ж��ַ����Ƿ�Ϊ��:" + s1.isEmpty());
		System.out.println("�ж������ַ����Ƿ����" + s1.equals(s2));
	}
}

