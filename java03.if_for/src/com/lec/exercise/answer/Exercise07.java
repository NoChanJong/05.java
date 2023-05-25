package com.lec.exercise.answer;

import java.io.IOException;
import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) throws IOException {
//		 7. Exercise07.java : 
//			 while문과 Scanner를 이용해서 키보드로 부터 입력된 데이터로 예금, 출금, 조회, 종료기능을
//			 제공하는 코드를 작성(예금잔액을 입출금내역을 출력)
//			 WhileKeyControlMain.java를 참조해서 자유롭게 작성
//							System.out.println("-------------------------------------");
//							System.out.println("1. 예금 | 2. 출금 | 3. 조회 | 4. 종료");
//							System.out.println("-------------------------------------");
//							
//							JOptionPan.showInputDialog() 이용해도 상관없음
	
		boolean run = true;
		int num = 0;
		int mon = 0;
		int sum = 0;
		
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			
			if(num != 13 && num != 10) {
				System.out.println("-------------------------------------");
				System.out.println("1. 예금 | 2. 출금 | 3. 조회 | 4. 종료");
				System.out.println("-------------------------------------");
			}
			num = System.in.read();
			
			if(num==49) {
				System.out.println("예금 할 금액을 알려주세요 => ");
				mon = scanner.nextInt();
				sum += mon;
				System.out.println(mon + "원 예금했습니다.");
			} else if(num==50) {
				System.out.println("출금 할 금액을 알려주세요 => ");	
				mon = scanner.nextInt();
				sum -= mon;
				System.out.println(mon + "원 출금했습니다.");
			} else if(num==51) {
				System.out.println("남은 금액은 " + sum + "원 입니다.");
			} else if(num==52) {
				run = false;
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}
	
}


































