package com.lec.ex10_abstract._method;

public class Bird extends Animal {

	@Override
	public void sound() { // sound() 메서드를 오버라이드 안할시 에러발생
		System.out.println("짹짹하고 소리를 낸다.");
	}
	
}
