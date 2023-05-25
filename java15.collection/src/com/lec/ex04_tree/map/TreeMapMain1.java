package com.lec.ex04_tree.map;

import java.util.*;

public class TreeMapMain1 {

	public static void main(String[] args) {
		
		// 1. TreeMap값 가져오기
		TreeMap<Integer, String> students = new TreeMap<>();
		students.put(87, "홍길동");
		students.put(98, "손흥민");
		students.put(75, "이강인");
		students.put(95, "김민재");
		students.put(80, "소향");
		
		Map.Entry<Integer, String> student = null;
		
		// 가장 낮은 점수, 가장 높은 점수, 95바로 아래 점수, 95 바로 위점수
		student = students.firstEntry();
		System.out.println("가장 낮은 점수인 사람 = " + student.getValue() + "의 점수는 = " + student.getKey());
		
		student = students.lastEntry();
		System.out.println("가장 높은 점수인 사람 = " + student.getValue() + "의 점수는 = " + student.getKey());

		student = students.lowerEntry(95);
		System.out.println("95바로 아래 점수인 사람 = " + student.getValue() + "의 점수는 = " + student.getKey());
		
		student = students.higherEntry(95);
		System.out.println("95바로 위의점수인 사람 = " + student.getValue() + "의 점수는 = " + student.getKey());
		
		student = students.floorEntry(94);
		System.out.println("94이거나 바로 아래 점수인 사람 = " + student.getValue() + "의 점수는 = " + student.getKey());
		
		student = students.ceilingEntry(94);
		System.out.println("94이거나 바로 위의 점수인 사람 = " + student.getValue() + "의 점수는 = " + student.getKey());
		System.out.println();
		
		while(!students.isEmpty()) {
//			student = students.pollFirstEntry();
			student = students.pollLastEntry();
			System.out.println(student.getValue() + "의 점수는 " + student.getKey() + ", 남은 객체 수 = " + students.size());
		}
	}

}

































