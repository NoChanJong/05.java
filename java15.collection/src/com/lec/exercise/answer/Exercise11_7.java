package com.lec.exercise.answer;

import java.util.*;

class Student1 {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	Student1(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	int getTotal() {
		return kor + eng + math;
	}

	float getAverage() {
		return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
	}

	public String toString() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math
				+ "," + getTotal() + "," + getAverage();
	}
}// class Student

class BanNoAscending implements Comparator<Student1> {
	public int compare(Student1 s1, Student1 s2) {
		if(s1.ban > s2.ban) {
			return 1;
		} else if(s1.ban == s2.ban) {
			if(s1.no > s2.no) { 
				return 1;
			} else return -1;
		}
		return -1;
		
		/* (1) 알맞은 코드를 넣어 완성하시오  . */
	}
}

class Exercise11_7 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Student1("이자바", 2, 1, 70, 90, 70));
		list.add(new Student1("안자바", 1, 2, 80, 80, 90));
		list.add(new Student1("홍길동", 2, 2, 60, 100, 80));
		list.add(new Student1("남궁성", 1, 3, 100, 100, 100));
		list.add(new Student1("김자바", 1, 1, 90, 70, 80));

		Collections.sort(list, new BanNoAscending());
		
		Iterator it = list.iterator();
		
		while (it.hasNext())
			System.out.println(it.next());

	}
}
