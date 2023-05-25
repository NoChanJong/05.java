package com.lec.ex03_method_overiding;

public class SuperSonicAirplaneMain {

	public static void main(String[] args) {
		
		SuperSonicAirplane sa = new SuperSonicAirplane();
		
		sa.takeOff();
		sa.fly();
		sa.flymod = SuperSonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flymod = SuperSonicAirplane.NORMAL;
		sa.fly();
		sa.land();
		
	}

}
