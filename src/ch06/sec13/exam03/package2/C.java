package ch06.sec13.exam03.package2;

import ch06.sec13.exam03.package1.A;

public class C {
	//객체생성
	public C() {
		A a = new A();
		
		a.field1 = 1;
//		a.field2 = 1;
//		a.field3 = 1;
//		default,private 필드, 메소드 접근 불가
		a.method1();
//		a.method2();
//		a.method3();
	}
			
}
