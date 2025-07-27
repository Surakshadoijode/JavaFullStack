package project1;

import java.util.Scanner;

public class SwapWithTemp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=sc.nextInt();
		System.out.println("Enter Second number");
		int b=sc.nextInt();
		int temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapling a: "+ a + " b : " +b);

	}

}
