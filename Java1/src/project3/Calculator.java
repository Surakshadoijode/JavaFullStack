package project3;

public class Calculator {
	int num1, num2;
	Calculator(int num1, int num2) {
		this.num1=num1;
		this.num2=num2;
	}
	static int powerInt(int num1, int num2) {
		return(int) Math.pow(num1, num2);
	}
	static double powerDouble(double num1, int num2) {
		return Math.pow(num1, num2);
	}
	

	public static void main(String[] args) {
		int result1=powerInt(2, 5);
		double result2=powerDouble(2.03,5);
		System.out.println("Result1 :"+ result1);
		System.out.println("result2 :"+ result2);
	}

}
