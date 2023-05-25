package com.lec.exercise.ex01;

class Exercise9_7 { 
	
	/* (1) contains 메서드를 작성하시오 . */
	public static boolean contains(String src, String target) {
		int b = src.indexOf(target);
		
		if(b > 0) {
			return true;
		} else return false;
	}
	public static void main(String[] args) {
		System.out.println(contains("12345", "23"));
		System.out.println(contains("12345", "67"));
	}
}
