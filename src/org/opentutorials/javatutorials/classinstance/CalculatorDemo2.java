package org.opentutorials.javatutorials.classinstance;

class Calculator2 {
  static double PI = 3.14;
  static int base = 0;
  int left, right;
  
  
  public void setOprands(int left, int right) {
	  this.left = left;
	  this.right = right;
  }
  
  public void avg() {
	  //평균치에 base의 값을 포함시킨다.
	  System.out.println((this.left + this.right + base) / 2);
  }
  
  public void sum(){
	  System.out.println(this.left + this.right+ base);
  }
}

public class CalculatorDemo2 {
	public static void main(String[] args) {
		Calculator2 c1 = new Calculator2();
		c1.setOprands(10, 20);
		//30
		c1.sum();
		
		Calculator2 c2 = new Calculator2();
		c2.setOprands(20, 40);
		c2.sum();
		
		Calculator2.base = 10;
		c1.sum();
		c2.sum();
	}
}
