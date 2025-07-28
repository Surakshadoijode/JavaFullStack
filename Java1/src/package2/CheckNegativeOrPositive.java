package package2;
import java.util.Scanner;

public class CheckNegativeOrPositive {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
        int a=sc.nextInt();
        if(a<0) {
        	System.out.println("It is negative number");
        }
        else if(a>0) {
        	System.out.println("It is positive number");
        }
        else {
        	System.out.println("It is Zero");
        }
        sc.close();
    }

}
