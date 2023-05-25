package com.lec.robot.v8_final;

import com.lec.robot.v4_인터페이스.impl.*;

public class RobotMain {

	public static void main(String[] args) {
		System.out.println("=== Robot V8.0 (final) ===");
		System.out.println();
		
		Robot robot = null;
		
		robot = new Robot("Cheap", 5, new FlyNo(), new MissileNo(), new SwordNone());
		robot.makeRobot();
		
		robot = new Robot("Stadard", 5, new FlyNo(), new MissileYes(), new SwordWod());
		robot.makeRobot();
		
		robot = new Robot("Super", 5, new FlyYes(), new MissileYes(), new SwordLaser());
		robot.makeRobot();
		
		
		// 실습
		// 1. v4에서 setter를 없애는 로직
		// 2. v8에서 method 다형성(makeRobot(InterFly, InterMissile, InterSword))

		robot = new Robot("CheapRobot", 10);
		robot.makeRobot(new FlyNo(), new MissileNo(), new SwordNone());
		
		robot = new Robot("StandardRobot", 10);
		robot.makeRobot(new FlyNo(), new MissileYes(), new SwordWod());
		
		robot = new Robot("SuperRobot", 10);
		robot.makeRobot(new FlyYes(), new MissileYes(), new SwordLaser());
		
	}
}


































