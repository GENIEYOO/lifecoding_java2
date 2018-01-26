package org.opentutorials.javatutorials.scope;

public class ScopeDemo4{
	static int i;
	
	static void a() {
		i = 0;
	}
	
	
  public static void main(String[] args) {
	  for(i = 0; i < 5; i++) {
		  a();//+1되도 다시 0으로 만들어 버림.
		  System.out.println(i);
	  }
  }
}

///이렇게 하면  클래스 i라서 i가 계속 0만 찍음
//반복문을 통해서 변수 i의 값을 아무리 바꿔도 메소드 a에 의해서 클래스 변수 i의 값이 0이 되기 때문에 반복문이 멈추지 않게 되는 것이다.