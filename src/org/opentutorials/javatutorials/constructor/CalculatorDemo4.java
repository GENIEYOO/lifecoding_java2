package org.opentutorials.javatutorials.constructor;

class Calculator{
	int[] oprands;
	
	
 
	
	
	public void setOperands(int [] oprands) {
		this.oprands = oprands;
	}
	
//	public void setOperands(int left, int right, int third) {
//		System.out.println("setOperands(int left, int right, int third");
//		this.third = third;
//	}
	
	//���� �޼ҵ���� ���� �Ű������� �ٸ� �޼ҵ� ���� : �����ε�!
	
	 public void sum(){
	       int total = 0;
	       for(int value : this.oprands){
	    	   total +=value;
	       }
	       System.out.println(total);
	    }
	      
	    public void avg(){
	        int total = 0;
	        for(int value : this.oprands) {
	        	total += value;
	        }
	        System.out.println(total/this.oprands.length);
	    }
	}
	  

public class CalculatorDemo4{
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOperands(new int[]{10, 20});
		c1.sum();
		c1.avg();
		c1.setOperands(new int[] {10, 20, 30});
		c1.sum();
		c1.avg();
	}
}
