package com.lec.exercise.answer;

public class Exercise08 {

	public static void main(String[] args) {
		int[][] arr = {
				{95, 86},
				{83, 92 ,96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0; // 합계 값
		int count = 0; // 배열별 숫자 갯수
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				sum += arr[i][j]; // [{a, b}] -> a+b ~ (a+b)+a2+b2~.....
				count++; // [{a, b}] -> 2 ~ [{a2, b2, c}] -> 3+2~......
			}
			double avg = (double)sum / (double)count;
			System.out.println("전체 항목의 합계 = " + sum);
			System.out.println("전체 항목의 평균" + avg);
		}	
	}

}
