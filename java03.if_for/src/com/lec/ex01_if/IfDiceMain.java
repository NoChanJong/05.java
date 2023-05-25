package com.lec.ex01_if;

public class IfDiceMain {

	public static void main(String[] args) {
		// 실습. 주사위 던지기 Math.random()
		// "?번이 나왔습니다."로 출력하는 if문
		// if else if else ~
		
		double num = Math.random();
		System.out.println(num*6);
		
		int dice = (int)(num*6) + 1;
		
		if(dice==1) {
			System.out.println(dice + "번이 나왔습니다");
		} else if(dice==2) {
			System.out.println(dice + "번이 나왔습니다");
		} else if(dice==3) {
			System.out.println(dice + "번이 나왔습니다");
		} else if(dice==4) {
			System.out.println(dice + "번이 나왔습니다");
		} else if(dice==5) {
			System.out.println(dice + "번이 나왔습니다");
		} else if(dice==6) {
			System.out.println(dice + "번이 나왔습니다");
		}
	}

}
