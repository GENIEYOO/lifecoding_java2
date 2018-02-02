package AbstactDemo;

abstract class A{
	public abstract int b();
	///괄호 없음
	public void d(){
		System.out.println("world");
	}
}
class B extends A{
	public int b(){
		return 1;
	}
}

public class AbstractDemo {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.b());
    }
}