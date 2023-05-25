package com.lec.robot.v2_상속;

public class RobotMain {

	public static void main(String[] args) {
		System.out.println("=== Robot V2.0 (상속) ===");
		CheapRobot cheap = new CheapRobot(10);
		cheap.name = "CheapRobot";
		cheap.shape();
		cheap.actionWalk();
		cheap.actionRun();
		cheap.actionFly();
		cheap.actionMissile();
		cheap.actionSword();
		System.out.println("CheapRobot의 재고수량 = " + cheap.qty);
		System.out.println();
		
		StandardRobot standard = new StandardRobot(15);
		standard.name = "StandradRobot";
		standard.shape();
		standard.actionWalk();
		standard.actionRun();
		standard.actionFly();
		standard.actionMissile();
		standard.actionSword();
		System.out.println("StandardRobot의 재고수량 = " + standard.qty);
		System.out.println();
		
		SuperRobot superRobot = new SuperRobot(25);
		superRobot.name = "SuperRobot";
		superRobot.shape();
		superRobot.actionWalk();
		superRobot.actionRun();
		superRobot.actionFly();
		superRobot.actionMissile();
		superRobot.actionSword();
		System.out.println("SuperRobot의 재고수량 = " + superRobot.qty);
		
	}

}
