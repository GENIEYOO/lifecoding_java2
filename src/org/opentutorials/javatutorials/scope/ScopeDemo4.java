package org.opentutorials.javatutorials.scope;

public class ScopeDemo4{
	static int i;
	
	static void a() {
		i = 0;
	}
	
	
  public static void main(String[] args) {
	  for(i = 0; i < 5; i++) {
		  a();//+1�ǵ� �ٽ� 0���� ����� ����.
		  System.out.println(i);
	  }
  }
}

///�̷��� �ϸ�  Ŭ���� i�� i�� ��� 0�� ����
//�ݺ����� ���ؼ� ���� i�� ���� �ƹ��� �ٲ㵵 �޼ҵ� a�� ���ؼ� Ŭ���� ���� i�� ���� 0�� �Ǳ� ������ �ݺ����� ������ �ʰ� �Ǵ� ���̴�.