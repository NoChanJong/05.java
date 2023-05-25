package com.lec.exercise.실습;

public class MemberFactory {

	private MemberFactory() {}	
	private static MemberDAOImpl dbmao = null;
	public static MemberDAOImpl getInstance() {
		if(dbmao == null) dbmao = new MemberDAOImpl();
		return dbmao;
	}
	
}
