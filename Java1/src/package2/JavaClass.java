package package2;

import java.util.Scanner;

class JavaClass {
	static void BasicCalculator(int a, int b) {
	System.out.println("Addition : "+ (a+b));
	System.out.println("Subtraction : "+ (a-b));
	System.out.println("Multiplication : "+ (a*b));
	System.out.println("Division : "+ (a/b));
	System.out.println("modulus : "+ (a%b));
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=sc.nextInt();
		System.out.println("Enter Second number");
		int b=sc.nextInt();
		BasicCalculator( a, b);
		sc.close();
	}

}
