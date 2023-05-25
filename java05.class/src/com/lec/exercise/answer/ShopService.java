package com.lec.exercise.answer;

public class ShopService {
	
	private ShopService() {} // private 접근제한자로 메서드생성
	
	private static ShopService shopservice = new ShopService();
	
	static ShopService getIntance() {
		return shopservice;
	}
	
	
}
