package package2;
import java.util.Arrays;

public class DuplicateValuesInArray {

	public static void main(String[] args) {
		int []arr= {5,2,5,7,2};
		System.out.println("Original Array : "+Arrays.toString(arr));
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j] && i!=j) {
					 System.out.println("Duplicate Element : "+arr[j]); 
				}
			}
		}
	}

}
