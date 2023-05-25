package com.lec.ex03_method_overiding;

public class ComputerMain {

	public static void main(String[] args) {
		int radius = 10;
		System.out.println(Math.PI);
		System.out.println();
		
		Calculator caculator = new Calculator();
		System.out.println("원의 면적 = " + caculator.areaCircle(radius));
		System.out.println();

		Computer computer = new Computer();
		System.out.println("원의 면적 = " + computer.areaCircle(radius));
		System.out.println();
	}

}
