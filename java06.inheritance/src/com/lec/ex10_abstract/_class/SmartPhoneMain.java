package com.lec.ex10_abstract._class;

/*
	추상클래스
	
	1. 추상클래스의 개념
	
	   사전적인 의미로는 추상은 실체간에 공통된 특성을 추출(선언)한 것을 말한다. 예를들어
	   새, 곤충, 물고기등의 실체에서 공통된 특성을 추출해 보면 동물이라는 공통점이 있다. 
	   이와 같이 구체적인 실체라기보다는 실체들의 공통된 특성을 가지고 있는 것을 추상적인 것이라고 볼 수 있다.
	   
	   클래스에서도 추상클래스를 정의할 수가 있다. 객체를 직접 생성할 수 있는 클래스를 실체클래스라고 한다면 
	   이 실체 클래스의 공통된 특성을 추출해서 선언한 클래스를 추상클래스라고 한다.
	   
	   추상클래스와 실체클래스는 상속관계를 가지고 있다. 추상클래스가 부모클래스이고 실체클래스가 자식클래스로 구현되어
	   실체클래스는 추상클래스의 모든 특성을 상속받고 또한 실체클래스에서 추가적인 특성을 가질 수가 있다.
	   여기서 특성이란 필드와 메서드를 말한다.
	   
	   추상클래스는 실체클래스의 공통되는 필드와 메서드를 추출해서 만들었기 때문에 추상클래스로 객체를 직접 생성할 수가 없다.
	   다시 말해서 추상클래스는 new연산자를 사용해서 객체(인스턴스)를 생성할 수가 없다.
	   
	2. 추상클래스의 용도
	
	   1) 실체클래스의 공통된 필드와 메서드의 이름을 통일(공통사용)할 목적
	   2) 실체클래스를 작성할 때 개발 시간을 단축
	
	3. 추상클래스의 선언
	
	   추상클래스는 실체 클래스가 공통적으로 가져야할 필드와 메서드를 정리해 놓은 추상적인 클래스이므로 
	   실체 클래스의 멤버(필드, 메서드)를 통일화 하는데 목적이 있다.
	   
	   모든 실체들이 가지고 있는 메서드의 실행내용이 동일하다면 추상클래스에 메서드를 작성하는 것이 좋을 것이지만 
	   메서드의 선언만 통일화하고 실제 실행내용은 실체클래스마다 달라야 하는 경우가 있다.
	   
	   예를 들어, Animal이라는 추상클래스에서 sound()라는 메서드를 정의한 후에 Cat, Dog, Bird 즉, Animal추상클래스를 상속받은
	   실체클래스에서 각각의 실체의 특성에 맞게 메서드를 작성하고 sound()라는 메서드는 실체클래스에서 
	   반드시 구현되도록 하기 위해서 추상메서드로 선언하고 그 추상메서드를 상속받는 실체클래스에서 실제로 실행할 메서드를 구현하도록 한다.
	
*/
public class SmartPhoneMain {

	public static void main(String[] args) {
		
		// 추상클래스는 객체를 생성할 수 없다
		// Phone phone = new Phone();
		
		SmartPhone phone = new SmartPhone("홍길동");
		System.out.println(phone.owner);
		phone.powerOn();
		phone.internetSearch("www.google.com");
		phone.powerOff();
	}

}

















































