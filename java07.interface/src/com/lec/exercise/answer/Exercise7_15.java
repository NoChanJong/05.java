package com.lec.exercise.answer;

public class Exercise7_15 {
	public static void main(String[] args) {
		Unit u = new Unit();
		Tank t = new Tank();
		AirCraft ac = new AirCraft();
	
		u = (Unit) ac;
		u = ac;
		GroundUnit gu = (GroundUnit) u;
		AirUnit au = ac;
		t = (Tank)u;
		// GroundUnit gu = t;
	}
}
// f. GroundUnit gu = t;

class Unit {}
class AirUnit extends Unit {}
class GroundUnit extends Unit {}
class Tank extends GroundUnit {}
class AirCraft extends AirUnit {}
