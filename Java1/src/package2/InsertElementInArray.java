package package2;

import java.util.Arrays;

public class InsertElementInArray {

	public static void main(String[] args) {
		int []arr= {25,14,56,15,36};
		System.out.println("Original Array : "+Arrays.toString(arr));
		int indexPosition=3;
		int newElement=78;
		for(int i=arr.length-1;i>indexPosition;i--) {
			arr[i]=arr[i-1];
		}
		arr[indexPosition]=newElement;
		System.out.println("Array after Inserting"+Arrays.toString(arr));

	}

}
