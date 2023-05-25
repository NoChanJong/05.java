package com.lec.ex02_arithmetic;

public class StringConcatMain {

	public static void main(String[] args) {
		// 문자열 연결연산자(+)
		// + 연산자는 산술연산자, 부호연산자인 동시에 문자열 연결연산자이기도 하다.
		// 연산자의 우선순위에 의해서 연산 순서가 결정
		String str1 = "JDK" + 1.8;
		System.out.println(str1);
		
		String str2 = str1 + "특징";
		System.out.println(str2);
		
		String str3 = "JDK" + 1.8 + 0.2;
		System.out.println(str3);

		String str4 = 1.8 + 0.2 + "JDK";
		System.out.println(str4);
		
				
	}

}
