package project1;

import java.util.Scanner;

public class OnesCompliment {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int a=sc.nextInt();
		System.out.println("One's Complement "+ (~a));
		sc.close();
	}

}
