package project1;

import java.util.Scanner;

public class BitwiseOperator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=sc.nextInt();
		System.out.println("Enter Second number");
		int b=sc.nextInt();
		System.out.println("AND: "+ (a&b));
		System.out.println("OR: "+ (a|b));
		System.out.println("XOR: "+ (a^b));
		System.out.println("Left shift b<<1: "+ (b<<1));
		System.out.println("Right shift b>>1: "+ (b>>1));
		sc.close();

	}

}

