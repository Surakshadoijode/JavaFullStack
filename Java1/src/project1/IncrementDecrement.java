package project1;

import java.util.Scanner;

public class IncrementDecrement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=sc.nextInt();
		System.out.println("Post Increament "+ (a++));
		System.out.println("Pre Increment "+(++a));
		System.out.println("Post Decrement "+ (a--));
		System.out.println("Pre Decrement "+ (--a));
		sc.close();

	}

}
