package assesment1;

import java.util.Scanner;

public class ReversingTheString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		String[] words=input.split(" ");
		StringBuilder result=new StringBuilder();
		for(String word:words) {
			StringBuilder rev=new StringBuilder(word);
			result.append(rev.reverse()).append(" ");
		}
		System.out.println(result.toString().trim());
		sc.close();
	}

}
