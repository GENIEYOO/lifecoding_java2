package org.opentutorials.javatutorials.scope;

public class ScopeDemo6 {
	static int i = 5;
	
	static void a() {
		int i = 10;
		b();
	}

	static void b() {
		System.out.println(i);
		//Ŭ���� �������� i�� �޼ҵ� a���� ����.
		//���� �����Ź�� ���Ǵ� ���������� ��ȿ������ ����ϴ� ���� �ƴ϶� ���ǵ� ���������� 
		//��ȿ���� i =5 �� ����ϴ� ��.
	}
	
	public static void main(String[] args) {
		a();
	}
}
