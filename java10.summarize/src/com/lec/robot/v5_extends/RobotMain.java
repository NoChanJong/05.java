package com.lec.robot.v5_extends;

import com.lec.robot.v4_인터페이스.impl.FlyNo;
import com.lec.robot.v4_인터페이스.impl.MissileNo;
import com.lec.robot.v4_인터페이스.impl.MissileYes;
import com.lec.robot.v4_인터페이스.impl.SwordLaser;
import com.lec.robot.v4_인터페이스.impl.SwordNone;
import com.lec.robot.v4_인터페이스.impl.SwordWod;

public class RobotMain {

	public static void main(String[] args) {
		System.out.println("=== Robot V5.0 (인터페이스, extends) ===");
		System.out.println();
		
		Robot robot = null;
		
		robot = new CheapRobot("CheapRobot", 10);
		System.out.println(robot.getClass());
		robot.shape();
		robot.actionWalk();
		robot.actionRun();
		robot.setFly(new FlyNo());
		robot.actionFly();
		robot.setMissile(new MissileNo());
		robot.actionMissile();
		robot.setSword(new SwordNone());
		robot.actionSword();
		System.out.println(robot.name + "의 재고수량 = " + robot.qty);
		System.out.println();
		
		robot = new StandardRobot("StandardRobot", 10);
		System.out.println(robot.getClass());
		robot.shape();
		robot.actionWalk();
		robot.actionRun();
		robot.setFly(new FlyNo());
		robot.actionFly();
		robot.setMissile(new MissileYes());
		robot.actionMissile();
		robot.setSword(new SwordWod());
		robot.actionSword();
		System.out.println(robot.name + "의 재고수량 = " + robot.qty);
		System.out.println();
		
		robot = new SuperRobot("SuperRobot", 10);
		System.out.println(robot.getClass());
		robot.shape();
		robot.actionWalk();
		robot.actionRun();
		robot.setFly(new FlyNo());
		robot.actionFly();
		robot.setMissile(new MissileYes());
		robot.actionMissile();
		robot.setSword(new SwordLaser());
		robot.actionSword();
		System.out.println(robot.name + "의 재고수량 = " + robot.qty);
		System.out.println();
		
		
	}

}
