package stringsprog;
import java.util.Scanner;
public class UnicodeCodePoint {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int index=sc.nextInt();
		String str=new String("HelloWorld");
		System.out.println("Original String: "+str);
		int index1=str.charAt(index-1);
		System.out.println("UnicodeCodePoint is :"+ index1);
		sc.close();
	}

}
