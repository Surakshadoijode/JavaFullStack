package package2;

public class CommonElementsInTwoArrays {

	public static void main(String[] args) {
		int []arr1= {5,2,7,8,3};
		int []arr2= {6,7,2,5,4};
		for(int i=0;i<arr1.length-1;i++) {
			for(int j=0;j<arr2.length-1;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.println("Common elements: "+arr2[j]);
				}
			}
		}

	}

}
