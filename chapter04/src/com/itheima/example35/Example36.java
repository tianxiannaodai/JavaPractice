package com.itheima.example35;
public class Example36 {
	// 下面的方法实现了两个整数相除，
     public static int divide(int x,int y) throws DivideByMinusException {
		if (y == 0) {
			// 使用throw关键字声明异常对象
			throw new DivideByMinusException("除数是0");
		}
		int result = x / y; // 定义一个变量result记录两个数相除的结果
		return result;      // 将结果返回
	}
	public static void main(String[] args) {
		try {
			int result = divide(4, 0);
			System.out.println(result);
		} catch (DivideByMinusException e) {
			System.out.println("捕获的异常信息为：" + e.getMessage());
		}
	}
}

