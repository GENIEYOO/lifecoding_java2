package org.opentutorials.javatutorials.classinstance;


class Calculator3 {
	public static void sum(int left, int right) {
		System.out.println(left + right);
	}
	//static�� �ִ� �޼ҵ�� Ŭ������ ���������ؼ� �� �� �ִ�.
	
	public static void avg(int left, int right) {
		System.out.println((left + right)/2);
	}
}




public class CalculatorDemo3 {
	
	public static void main(String[] args) {
		Calculator3.sum(10,  20);
		//static�� �ִ� �޼ҵ�� Ŭ������ ���������ؼ� �� �� �ִ�.
		Calculator3.avg(30,  20);
	//�ʿ��� �� ���� �� �� �� �� Ŭ������ ����ų� 1ȸ��ó�� �� ���� Ŭ���������� �޸� ���� ����.
	// setOperandsó�� �ϰ������� ���� ������ �� c1.sum() �̷����̸� ��ü���� �ϴ� �� ����.
		
		Calculator3.sum(20, 40);
		Calculator3.avg(20, 40);
	}

}
