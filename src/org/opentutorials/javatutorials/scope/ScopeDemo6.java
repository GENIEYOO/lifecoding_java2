package org.opentutorials.javatutorials.scope;

public class ScopeDemo6 {
	static int i = 5;
	
	static void a() {
		int i = 10;
		b();
	}

	static void b() {
		System.out.println(i);
		//클래스 전역변수 i가 메소드 a에서 사용됨.
		//정적 스코픕방식 사용되는 시점에서의 유효범위를 사용하는 것이 아니라 정의된 시점에서의 
		//유효범위 i =5 를 사용하는 것.
	}
	
	public static void main(String[] args) {
		a();
	}
}
