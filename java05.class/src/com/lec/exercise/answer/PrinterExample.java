package com.lec.exercise.answer;

public class PrinterExample {

	public static void main(String[] args) {
		
		Printer p = new Printer();
		p.a = 13;
		p.b = false;
		p.c = 11.2;
		p.d = "Hi";
		
		System.out.println(p.toString());
	}

}
