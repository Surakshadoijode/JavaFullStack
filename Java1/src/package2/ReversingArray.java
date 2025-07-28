package package2;

import java.util.Arrays;

public class ReversingArray {

	public static void main(String[] args) {
		int []arr= {12,34,23,56,78,2,10};
		int temp;
		System.out.println("Original Array : "+Arrays.toString(arr));
		for(int i=0;i<arr.length/2;i++) {
			temp=arr[i];
			arr[i]=arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;
		}
		System.out.println("After reversinh the array : "+Arrays.toString(arr));
	}
}
