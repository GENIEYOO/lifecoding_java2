package org.opentutorials.javatutorials.constructor;

class Calculator {
   int left, right;
   
   
   public Calculator(int left, int right) {
	   this.left = left;
	   this.right = right;
   }
   //생성자를 추가하여 객체 setOperands과정을 생성 과정에서 강제함.
   //이름이 객체와 같으면 메소드생성이아니라 생성자인듯..
   
   public void sum() {
	   System.out.println(this.left + this.right);
   }
   
   public void avg() {
	   System.out.println((this.left + this.right)/2);
   }
}


public class CalculatorDemo1 {
	
	public static void main(String[] args) {
		Calculator c1 = new Calculator(10, 20);
		c1.sum();
		c1.avg();
		
		
		Calculator c2 = new Calculator(20, 40);
		c2.sum();
		c2.avg();
	}
	
	
	
}