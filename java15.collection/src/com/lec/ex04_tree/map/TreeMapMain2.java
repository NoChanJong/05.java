package com.lec.ex04_tree.map;

import java.util.*;

public class TreeMapMain2 {

	public static void main(String[] args) {
		
		// 2. TreeMap 정렬하기
		// descendingMap(), descendingEntrySet()
		TreeMap<Integer, String> students = new TreeMap<>();
		students.put(87, "홍길동");
		students.put(98, "손흥민");
		students.put(75, "이강인");
		students.put(95, "김민재");
		students.put(80, "소향");
		
		// 정렬메서드 : descendingMap(), descendingEntrySet()
		NavigableMap<Integer, String> dm = students.descendingMap();
		Set<Map.Entry<Integer, String>> desEntry = dm.entrySet();
		for(Map.Entry<Integer, String> score:desEntry) {
			System.out.println(score.getValue() + "의 점수 = " + score.getKey());
		}
		System.out.println();
		
		// 내림차순
//		dm = desEntry.
		
		// 오름차순 -> 내림차순
		System.out.print("오름차순 -> 내림차순 : ");
//		NavigableMap<Integer, String> ascMap = desEntry.();
//		for(Integer score:ascMap.keySet()) {
//			System.out.print(score + ", ");
//		}
//		System.out.println();
	}

}







































