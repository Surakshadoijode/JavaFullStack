package package2;

public class SecondLargestElementInArray {

	public static void main(String[] args) {
		int []arr= {1,89,34,56,12,45};
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]<arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Second Largest element :"+ arr[1]);
	}

}
