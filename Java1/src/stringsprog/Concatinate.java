package stringsprog;
import java.util.Scanner;

public class Concatinate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		System.out.println("String After Concatination :"+str1.concat(str2));
		sc.close();
	}

}
