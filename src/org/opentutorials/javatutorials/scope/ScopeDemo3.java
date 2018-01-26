package org.opentutorials.javatutorials.scope;

public class ScopeDemo3 {
	static int i;
	
	static void a() {
		int i = 0;
	}

	public static void main(String[] args) {
		for(i = 0; i < 5; i ++) {
			a();
			//메소드에서 선언된 변수는 클래스변수보다 우선순위가 높다.
			System.out.println(i);
		}
	}
}
