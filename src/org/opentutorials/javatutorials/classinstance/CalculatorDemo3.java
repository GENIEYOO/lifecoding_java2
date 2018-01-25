package org.opentutorials.javatutorials.classinstance;


class Calculator3 {
	public static void sum(int left, int right) {
		System.out.println(left + right);
	}
	//static이 있는 메소드는 클래스에 직접접근해서 쓸 수 있다.
	
	public static void avg(int left, int right) {
		System.out.println((left + right)/2);
	}
}




public class CalculatorDemo3 {
	
	public static void main(String[] args) {
		Calculator3.sum(10,  20);
		//static이 있는 메소드는 클래스에 직접접근해서 쓸 수 있다.
		Calculator3.avg(30,  20);
	//필요할 때 마다 그 때 그 때 클래스로 끌어쓰거나 1회용처럼 쓸 때는 클래스접근이 메모리 차지 않함.
	// setOperands처럼 일괄적으로 무언가 설정한 후 c1.sum() 이런식이면 객체생성 하는 게 좋음.
		
		Calculator3.sum(20, 40);
		Calculator3.avg(20, 40);
	}

}
