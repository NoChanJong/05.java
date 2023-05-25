package com.lec.exercise.answer;

public class Exercise05 {

	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		int sum = 0;
		
		
		for(x=1; x<=10; x++) {
			for(y=1; y<=10; y++) {
				sum = (4*x) + (5*y);
				if(sum == 60) {
					System.out.println("x = " + x + ", y = " + y + ", 4x + 5y = " + sum);
				}
			}
		}
	}

}
