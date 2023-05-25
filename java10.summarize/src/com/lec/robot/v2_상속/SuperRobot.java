package com.lec.robot.v2_상속;

public class SuperRobot extends Robot {

	public SuperRobot(int qty) {
		super(qty);
	}

	@Override
	public void shape() {
		System.out.println(name + "팔, 다리, 머리, 몸통이 있습니다.");
	}

	@Override
	public void actionFly() {
		System.out.println("날 수가 있습니다.");
	}

	@Override
	public void actionMissile() {
		System.out.println("미사일을 쏠 수 있습니다.");
	}

	@Override
	public void actionSword() {
		System.out.println("광선검이 있습니다.");
	}

}
