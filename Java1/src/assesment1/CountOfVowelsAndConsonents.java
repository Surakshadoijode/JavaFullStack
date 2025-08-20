package assesment1;

import java.util.Scanner;

public class CountOfVowelsAndConsonents {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int count_vow=0;
		int count_conso=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='o' || s.charAt(i)=='O' || s.charAt(i)=='a' || s.charAt(i)=='A' || s.charAt(i)=='e' || s.charAt(i)=='E' || s.charAt(i)=='i' || s.charAt(i)=='I' || s.charAt(i)=='u' || s.charAt(i)=='U') {
				count_vow+=1;
			}else {
				count_conso+=1;
			}
		}
		System.out.println(count_vow +" " +count_conso);
		sc.close();

	}

}
