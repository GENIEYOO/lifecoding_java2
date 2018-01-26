package org.opentutorials.javatutorials.scope;

public class ScopeDemo5 {
	
	static void a() {
		String title = "coding everyday";
	}
	


	public static void main(String[] args) {
		a();
//		System.out.println(title);
//		오류남 반복문은 메소드 a에서만 유효하기 때문에
	}

}