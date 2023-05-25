package com.lec.robot.v6_method;

import com.lec.robot.v4_인터페이스.impl.*;
import com.lec.robot.v4_인터페이스.inter.*;

public class RobotMain {

	public static void main(String[] args) {
		System.out.println("=== Robot V6.0 (common method) ===");
		System.out.println();
		
		makeRobot(new Robot("Cheap", 10), new FlyNo(), new MissileNo(), new SwordNone());
		makeRobot(new Robot("Standard", 10), new FlyNo(), new MissileYes(), new SwordWod());
		makeRobot(new Robot("Super", 10), new FlyYes(), new MissileYes(), new SwordLaser());
//		robot = new StandardRobot("StandardRobot", 10);
//		robot = new SuperRobot("SuperRobot", 10);
	}

	private static void makeRobot(Robot robot, InterFly fly, InterMissile missile, InterSword sword) {
		System.out.println(robot.getClass());
		robot.shape();
		robot.actionWalk();
		robot.actionRun();
		robot.setFly(fly);
		robot.actionFly();
		robot.setMissile(missile);
		robot.actionMissile();
		robot.setSword(sword);
		robot.actionSword();
		System.out.println(robot.name + "의 재고수량 = " + robot.qty);
		System.out.println();
	}

}
