package stringsprog;
import java.util.Scanner;

public class SameDataInStringObjs {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		String str3=sc.nextLine();
		boolean equals1= (str1).equals(str2);
		boolean equals2= (str1).equals(str3);
		System.out.println(equals1);
		System.out.println(equals2);
		sc.close();
		
	}

}
