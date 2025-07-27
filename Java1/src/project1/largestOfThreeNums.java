package project1;

import java.util.Scanner;

public class largestOfThreeNums {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=sc.nextInt();
		System.out.println("Enter Second number");
		int b=sc.nextInt();
		System.out.println("Enter Third number");
		int c=sc.nextInt();
		int max=(a>b)&&(a>c)?a:(b>c)?b:c;
		System.out.println("Largest of three numbers :"+ max);
		sc.close();

	}

}
