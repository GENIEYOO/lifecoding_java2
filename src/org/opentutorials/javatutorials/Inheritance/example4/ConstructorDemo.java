package org.opentutorials.javatutorials.Inheritance.example4;

public class ConstructorDemo {
	public ConstructorDemo(){}
	public ConstructorDemo(int param1) {}
	public static void main(String[] args) {
		//ConstrunctorDemo c = new ConstructorDemo();
		//매개 변수가 있는 생성자가 있을 때는 자동으로 기본 생성자를 만들어주지않는다.
		//따라서 이렇게 호출하면 존재하지 않는 생성자 호출
		ConstructorDemo c = new ConstructorDemo();
	
	}

}
