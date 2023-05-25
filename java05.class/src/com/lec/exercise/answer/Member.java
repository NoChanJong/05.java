package com.lec.exercise.answer;

public class Member {
	
	String name;
	String id;
	String password;
	int age;
	
//	Member(String name) {}
//	Member(String id) {}
	
	public boolean login(String id, String password) {
		if(id=="hong" && password=="12345") {
			System.out.println("로그인되었습니다.");
			return true;
		} else {
			return false;
		}
	}
	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}
