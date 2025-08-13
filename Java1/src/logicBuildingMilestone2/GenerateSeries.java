package logicBuildingMilestone2;

import java.util.Scanner;

public class GenerateSeries {
	public static int series(int input1, int input2, int input3, int N) {
		if(N==1) return input1;
		if(N==2) return input2;
		if(N==3) return input3;
		int sum=input1;
		int diff1=input2-input1;
		int diff2=input3-input2;
		for(int i=2;i<=N;i++) {
			sum+=(i%2==0)?diff1:diff2;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int input1=sc.nextInt();
		int input2=sc.nextInt();
		int input3=sc.nextInt();
		int N=sc.nextInt();
		int result=series(input1,input2,input3,N);
		System.out.println(result);
		sc.close();
	}

}
