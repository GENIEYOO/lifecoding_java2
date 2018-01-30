package org.opentutorials.javatutorials.pakages.example2;
import org.opentutorials.javatutorials.packages.exmaple1.A;



public class B {
	public static void main(String[] args) {
        //클래스 A가 다른 패키지에 있기 때문에 로드 할 수 없다.
        A a = new A();
//package를 로드 안하면 임포트 못한다.
}
}
