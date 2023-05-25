package com.lec.ex01_inheritance;

public class Adam extends Human{

	@Override
	public String toString() {
		return "Adam [toString()=" + super.toString() + "]";
	} // super.toString() -> 부모태그를 상속 받았지만 재정의한것은 아님 

	@Override
	void speak() {
		super.speak();
	}
	// super -> 부모태그 상속을 의미
	@Override
	void move() {
		System.out.println(this.name + "이 사냥을 합니다.");
	}
}
