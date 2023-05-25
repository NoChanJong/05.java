package com.lec.exercise.answer;

import java.io.IOException;
import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) throws IOException {
		// String[] std = {"홍길동", "홍길순", "홍길자", "홍길진"};
		
		boolean run = true;
		int num = 0;
		int[] arr = null;
		int stdNum;
		int score = 0;
		int max = 0;
		int sum = 0;
		
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			if(num != 13 && num !=10) {
				System.out.println("---------------------------------------------");
				System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
				System.out.println("---------------------------------------------");
				System.out.print("선택> ");	
			}
			num = System.in.read();
			
			if(num==49) {
				System.out.println("입력할 학생수를 알려주세요 => ");
				stdNum = scanner.nextInt();
				arr = new int[stdNum]; // 입력한 학생수를 넣을 배열 생성
			} else if(num==50) {
				System.out.println("점수를 입력해주세요 => ");
				for(int i=0; i<arr.length; i++) {
					arr[i] = scanner.nextInt(); // 입력한 점수를 넣을 배열을 for문으로 돌림
				}
			} else if(num==51) {
				System.out.println("입력한 점수리스트 입니다." );
				for(int i=0; i<arr.length; i++) {
					System.out.print(arr[i] + ", "); // 입력한 점수를 나란히 나올수있게함
				}
				System.out.println();
			} else if(num==52) {
				for(int i=0; i<arr.length; i++) {
					sum += arr[i]; // 배열에 입력한 점수들의 합계
					if(arr[i] > max) {
						max = arr[i]; // 각 점수중 최고값
					}
				}
				System.out.println("최고점수 = " + max + "\n" + "평균점수 = " + sum/arr.length); // 합계 점수를 배열의 길이로 나눠서 평균 구함
			} else if(num==53) {
				run = false;
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}

}
