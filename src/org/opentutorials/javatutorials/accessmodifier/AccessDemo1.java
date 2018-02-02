package org.opentutorials.javatutorials.accessmodifier;

class A {
	public String y() {
		return "public void y()";
	}

	
	private String z() {
		return "public void z()";
		
	}
	
	public String x() {
		return z();
	}


}

public class AccessDemo1 {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.y());
		System.out.println(a.x());
		//System.out.println(a.z());
		//실행 되지 않음. 오류 발생. 접근 제어자가 private이라
	}
}
