package project1;

import java.util.Scanner;

public class SwapUsingBitwise {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=sc.nextInt();
		System.out.println("Enter Second number");
		int b=sc.nextInt();
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After Swapling a: "+ a + " b : " +b);

	}

}
