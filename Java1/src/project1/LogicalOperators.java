package project1;

import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first boolean");
		boolean a=sc.nextBoolean();
		System.out.println("Enter Second boolean");
		boolean b=sc.nextBoolean();
		System.out.println("AND :"+ (a&&b));
		System.out.println("OR :"+ (a||b));
		System.out.println("NOT :"+ (!a));
		sc.close();

	}

}
