package org.opentutorials.javatutorials.Inheritance.example2;

class Calculator {
	int left, right;
	//public  개념 접근제어자.
	public Calculator(int left, int right) {
		this.left = left;
		this.right = right;
		//이 생성자가 매개변수가 있는 생성자라서 하위 클래스가 상위클래스의 기본 생성자를 만들어주지 않는다.
		//해결 방법 1.이 보다 위에 public Calculator() {}  기본생성자 만들어주기
	    //생성자란? 메소드명이 클래스명과 동일하고/리턴타입을 정의하지 않음.
	
	}
	public void setOperands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void sum() {
		System.out.println(this.left + this.right);
	}
	public void avg() {
		System.out.println((this.left + this.right)/2);
	}
}


class SubstractionableCalculator extends Calculator {
	public SubstractionableCalculator(int left, int right) {
		super(left, right);
		//부모 클래스를 의미 
	}
	
	public void substract(){
		System.out.println(this.left - this.right);
	}
}

public class CalculatorConstructorDemo4 {
	public static void main(String[] args) {
		SubstractionableCalculator c1 = new SubstractionableCalculator(10, 20);
		c1.sum();
		c1.avg();
		c1.substract();
	}	
}