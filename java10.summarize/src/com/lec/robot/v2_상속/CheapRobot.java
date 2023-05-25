package com.lec.robot.v2_상속;

public class CheapRobot extends Robot {

	public CheapRobot(int qty) {
		super(qty);
	}

	@Override
	public void shape() {
		System.out.println(name + "팔, 다리, 머리, 몸통이 있습니다.");
	}

}
