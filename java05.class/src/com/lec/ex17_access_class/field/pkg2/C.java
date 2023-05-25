package com.lec.ex17_access_class.field.pkg2;

import com.lec.ex17_access_class.field.pkg1.A;

public class C {
	public C() {
		
		A a = new A();
		
		a.field1 = 20; 	  // public
		// a.field2 = 30; // default(x)
		// a.field3 = 20; // private (x)
		
		a.method1(); 	// public
		// a.method2(); // default
		// a.method3(); // private(x)
	}
}
