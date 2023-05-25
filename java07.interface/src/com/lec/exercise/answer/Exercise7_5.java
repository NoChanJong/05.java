package com.lec.exercise.answer;

class Product {

	int price; // 제품의 가격
	int bonusPoint; // 제품구매 시 제공하는 보너스점수

	Product() {} // Product클래스에 기본생성자 Product() {} 선언되지 않았기 때문에 에러가 발생했다.
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}
}

class Tv extends Product {
	
	Tv() {} 

	public String toString() {
		return "Tv";
	}
}

class Exercise7_5 {
	public static void main(String[] args) {
		Tv t = new Tv();
	}
}