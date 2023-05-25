package com.lec.ex13_static;

public class CalculatorMain {

	public static void main(String[] args) {
		
		System.out.println("PI = " + Calculator.PI);
		System.out.println(Calculator.add(10, 10));
		// System.out.println("pi = " + Calculator.pi); // 접근불가(객체멤버)
		// System.out.println(Calculator.mul(10, 10)); // 접근불가(객체멤버)
		// Calculator.PI = 100.0; // PI는 final로 선언된 상수이기 때문에 수정불가
		System.out.println();
		
		Calculator cal = new Calculator();
		System.out.println("pi = " + cal.pi); // 객체멤버로서 접근가능
		System.out.println(cal.mul(10, 10)); // 접근불가(객체멤버)
		cal.pi = 1000.5;
		System.out.println("pi = " + cal.pi); 
		System.out.println();
		
		// 객체에서 정적멤버접근가능?
		// 접근은 가능하지만 static멤버는 class로 접근하는 것을 권장한다.
		System.out.println("객체에서 정적멤버 PI 접근 = " + cal.PI);
		System.out.println("객체에서 정적멤버 add 접근 = " + cal.add(10,10));
		
//		CalculatorMain calxxx = new CalculatorMain();
//		calxxx.xxx();
		yyy();
	}
	
	
	void xxx() {}
	static void yyy() {}
}
