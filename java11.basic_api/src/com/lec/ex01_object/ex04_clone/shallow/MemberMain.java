package com.lec.ex01_object.ex04_clone.shallow;

public class MemberMain {

	public static void main(String[] args) {
		
		// 1. 원본객체
		Member ord_member = new Member("hong", "홍길동", "12345", 40, true);
		
		// 2. 객체를 복제후에 패스워드를 변경
		Member clone_Member = ord_member.getMember();
		
		System.out.println("변경전 패스워드 = " + ord_member.password);
		clone_Member.password = "67890";
		System.out.println();
		
		System.out.println("[복제객체 clone_member]");
		System.out.println(clone_Member.id);
		System.out.println(clone_Member.name);
		System.out.println(clone_Member.password);
		System.out.println(clone_Member.age);
		System.out.println(clone_Member.adult);
		System.out.println();
		
		System.out.println("[원본객체 ord_member]");
		System.out.println(ord_member.id);
		System.out.println(ord_member.name);
		System.out.println(ord_member.password);
		System.out.println(ord_member.age);
		System.out.println(ord_member.adult);
		System.out.println();
		
		System.out.println(clone_Member.password.hashCode());
		System.out.println(ord_member.password.hashCode());
		System.out.println();
		
		System.out.println(clone_Member.scores.hashCode());
		System.out.println(ord_member.scores.hashCode());
		System.out.println();
		
		System.out.println("원본[0]: 변경전 점수 = " + ord_member.scores[0]);
		System.out.println("복제[0]: 변경후 점수 = " + clone_Member.scores[0]);
		System.out.println();
		
		ord_member.scores[0] = 100;
		System.out.println("원본[0]: 변경전 점수 = " + ord_member.scores[0]);
		System.out.println("복제[0]: 변경후 점수 = " + clone_Member.scores[0]);
		
	}

}



































