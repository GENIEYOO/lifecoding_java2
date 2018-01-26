package org.opentutorials.javatutorials.scope;



class C3 {
	int v = 10;
	
	void m() {
		int v = 20;
		System.out.println(this.v);
	}
}




public class ScopeDemo9 {
	
	public static void main(String[] args) {
		C3 c1 = new C3();
		c1.m();
		//this를 사용하면 인스턴스전역에 유효한 변수로 설정된다.
	}

}
