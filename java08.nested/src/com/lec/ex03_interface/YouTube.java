package com.lec.ex03_interface;

public class YouTube implements Button.OnClickListner {

	@Override
	public void OnClick() {
		System.out.println("YouTube를 시청합니다.");
	}
}
