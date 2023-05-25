package com.lec.robot.v4_인터페이스;

import com.lec.robot.v4_인터페이스.inter.*;

public class SuperRobot extends Robot {

//	InterFly fly;
//	InterMissile missile;
//	InterSword sword;
	
	public SuperRobot(String name, int qty) {
		super(name, qty);
	}
	
	@Override
	public void actionFly(InterFly fly) {fly.fly();}
	
	@Override
	public void actionMissile(InterMissile missile) {missile.missile();}
	
	@Override
	public void actionSword(InterSword sword) {sword.sword();}

//	public void setFly(InterFly fly) {this.fly = fly;}
//	public void setMissile(InterMissile missile) {this.missile = missile;}
//	public void setSword(InterSword sword) {this.sword = sword;}
}
