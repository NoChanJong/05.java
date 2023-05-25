package com.lec.exercise.answer;

public class Exercise04 {

	public static void main(String[] args) {
		
		
		int sum = 0;
		
		
		while(true) {
			int dice1 = (int)(Math.random()*6 + 1);
			int dice2 = (int)(Math.random()*6 + 1);
			System.out.println("(" + dice1 + ", " + dice2 + ")");
			
			if(dice1 + dice2 == 5) break;
			} 
			System.out.println("주사위 합이 5가 되었습니다.");
	}
}
