package com.lec.robot.v4_인터페이스;

import com.lec.robot.v4_인터페이스.impl.*;

public class RobotMain {

	public static void main(String[] args) {
		System.out.println("=== Robot V4.0 (인터페이스) ===");
		System.out.println();
		
		CheapRobot cheapRobot = new CheapRobot("CheapRobot", 10);
		cheapRobot.shape();
		cheapRobot.actionWalk();
		cheapRobot.actionRun();
		cheapRobot.actionFly(new FlyNo());
		cheapRobot.actionMissile(new MissileNo());
		cheapRobot.actionSword(new SwordNone());
		System.out.println(cheapRobot.name + "의 재고수량은 " + cheapRobot.qty + "개 입니다.");
		System.out.println();
		
		StandardRobot standardRobot = new StandardRobot("StandardRobot", 10);
		standardRobot.shape();
		standardRobot.actionWalk();
		standardRobot.actionRun();
		standardRobot.actionFly(new FlyNo());
		standardRobot.actionMissile(new MissileYes());
		standardRobot.actionSword(new SwordWod());
		System.out.println(standardRobot.name + "의 재고수량은 " + standardRobot.qty + "개 입니다.");
		System.out.println();
		
		SuperRobot superRobot = new SuperRobot("SuperRobot", 10);
		superRobot.shape();
		superRobot.actionWalk();
		superRobot.actionRun();
		superRobot.actionFly(new FlyYes());
		superRobot.actionMissile(new MissileYes());
		superRobot.actionSword(new SwordLaser());
		System.out.println(superRobot.name + "의 재고수량은 " + superRobot.qty + "개 입니다.");
	}
}


































