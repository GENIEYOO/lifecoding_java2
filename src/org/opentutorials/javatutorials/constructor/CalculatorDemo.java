package org.opentutorials.javatutorials.constructor;


class Calculator2 {
	//같은 패키지 안에 클래스에  Calculator 있으므로  Calculator2로
    int left, right;
 
    public void setOperands(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}
 
class SubstractionableCalculator extends Calculator2 {
    public void substract() {
        System.out.println(this.left - this.right);
    }
}
 
public class CalculatorDemo{
 
    public static void main(String[] args) {
 
        SubstractionableCalculator c1 = new SubstractionableCalculator();
        c1.setOperands(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
 
}