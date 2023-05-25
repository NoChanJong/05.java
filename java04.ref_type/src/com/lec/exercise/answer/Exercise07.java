package com.lec.exercise.answer;

public class Exercise07 {

	public static void main(String[] args) {
		int[] arr = {1,5,3,8,2};
		
		int max = arr[0]; // 초기값 설정
		
		for(int num : arr) {
			if(num > max) {
				max = num;
			}
		}
		System.out.println(max);
	}

}
