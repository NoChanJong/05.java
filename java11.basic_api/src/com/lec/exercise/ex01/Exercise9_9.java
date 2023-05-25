package com.lec.exercise.ex01;

class Exercise9_9 { 

	/* (1) delChar 메서드를 작성하시오 . */
	public static String delChar(String src, String delCh) {
		StringBuffer sb = new StringBuffer(src); // String src을 StringBuffer참조타입으로 변환
		
		for(int i=0; i<delCh.length(); i++) {
			int pos = 0;
			while (pos < src.length()) {
				int s = src.indexOf(delCh.charAt(i), pos);
				if(s == -1) {
					break;
				} else {
					sb.deleteCharAt(s);
					src = sb.toString();
				}
				pos = s;
			}
		}
		return sb.toString();
		
	}
	
	public static void main(String[] args) {
		System.out.println("(1!2@3^4~5)" + " -> "
				+ delChar("(1!2@3^4~5)", "~!@#$%^&*()"));
		System.out.println("(1 2 3 4\t5)" + " -> "
				+ delChar("(1 2 3 4\t5)", " \t"));
	}
}
