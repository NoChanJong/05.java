package com.lec.ex01_inheritance;

public class Eve extends Human{

	String bag  = "샤넬백";
	String cloth = "에르메스";
	
	@Override
	public String toString() {
		return "Eve [name=" + name + ", gender=" + gender 
				+ ", age=" + age + ", " + this.bag + ", " + this.cloth + "]";
	}

	@Override
	void speak() {
		System.out.println("천국말을 합니다");
	} // 부모 상속 받지 않고 재정의("천국말을 합니다")한 것

	void makeBaby() {
		System.out.println(this.name + "가 아기를 갖습니다.");
	}
	
	@Override
	void move() {
		System.out.println("음식을 만듭니다.");
	}
	

}
