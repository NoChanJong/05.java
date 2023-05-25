package com.lec.ex02_arithmetic;

public class CheckOverflowMain {

	public static void main(String[] args) {
		System.out.println(Integer.MIN_VALUE + "~" + Integer.MAX_VALUE);

		try {
			int result = safeAdd(2000000000, 2000000000);
			System.out.println(result);			
		} catch (ArithmeticException e) {
			System.out.println("OverFlow가 발생되어 정상적인 연산을 수행할 수 없습니다.");
		}		
	}	
	public static int safeAdd(int x, int y) {
		
		if(x > 0) {
			if(x > (Integer.MAX_VALUE - y)) {
				// 강제로 개발자가 예외를 발생시키는 방법
				throw new ArithmeticException("Overflow가 발생");
			}
		} else {
			if(x < Integer.MIN_VALUE - y) {
				throw new ArithmeticException("Overflow가 발생");				
			}
		}
		return x + y;		
	}
	
}
