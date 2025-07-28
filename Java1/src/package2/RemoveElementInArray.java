package package2;
import java.util.*;

public class RemoveElementInArray {
	public static void main(String args[]) {
		int []arr= {12,34,56,13,10};
		System.out.println("Original Array : "+Arrays.toString(arr)); 
		int removeIndex=1;
		for(int i=removeIndex;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		System.out.println("After removing the element : "+Arrays.toString(arr));
	}

}
