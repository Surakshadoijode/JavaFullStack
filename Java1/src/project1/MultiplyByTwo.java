package project1;

import java.util.Scanner;

public class MultiplyByTwo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=sc.nextInt();
		int res=a<<1;
		System.out.println(a + " * 2 = "+ res);
		sc.close();

	}

}

