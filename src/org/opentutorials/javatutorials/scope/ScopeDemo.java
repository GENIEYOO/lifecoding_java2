package org.opentutorials.javatutorials.scope;

public class ScopeDemo {
	static int i;
	
	static void a() {
		 int i = 0;
		 //전역변수 i와는 전혀 무관한 값
	}
	
	
	public static void main(String[] args) {
		for (int i = 0; i < 5; i ++) {
			a();
			System.out.println(i);
		}
	}

}
