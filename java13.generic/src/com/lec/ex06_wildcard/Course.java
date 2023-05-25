package com.lec.ex06_wildcard;

public class Course<T> {

	private String name;
	private T[] students;
	
	public Course(String name, int capacity) {
		this.name = name;
		this.students = (T[]) new Object[capacity]; // 수강인원
	}

	public String getName() {
		return name;
	}

	public T[] getStudents() {
		return students;
	}
	
	public void add(T t) {
		for(int i=0; i<students.length; i++) {
			if(students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
}
















