package com.lec.exercise.answer;

public class ShopServiceExample {

	public static void main(String[] args) {
		ShopService s1 = ShopService.getIntance();
		ShopService s2 = ShopService.getIntance();
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

}
