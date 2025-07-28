package package2;

public class MinMax {

	public static void main(String[] args) {
		int []arr= {12,34,56,78,31,23,2};
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println(arr.length);
		System.out.println("Maximum number: "+ max);
		System.out.println("Minimum number: "+ min);
	}

}
