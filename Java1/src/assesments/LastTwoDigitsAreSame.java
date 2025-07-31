package assesments;

import java.util.Scanner;

public class LastTwoDigitsAreSame {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First number");
		int a=sc.nextInt();
		System.out.print("Enter Second number");
		int b=sc.nextInt();
		int rem1=a%10;
		int rem2=b%10;
		if(rem1==rem2) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		sc.close();
	}

}
