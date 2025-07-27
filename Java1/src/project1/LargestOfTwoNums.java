package project1;

import java.util.Scanner;

public class LargestOfTwoNums {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=sc.nextInt();
		System.out.println("Enter Second number");
		int b=sc.nextInt();
		int max=(a>b)?a:b;
		System.out.println("Largest of two numbers: "+ max);


	}

}
