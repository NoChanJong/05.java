package com.lec.ex17_access._counstructor.pkg1;

public class A {
	
	public A(boolean x) {}
	protected A(double x) {}
			  A(int x) {}		// default
	private A(String x) {}
	
	A a1 = new A(false); // public
	A a2 = new A(1.0);   // protected
	A a3 = new A(1);     // default
	A a4 = new A("1");   // private
}
