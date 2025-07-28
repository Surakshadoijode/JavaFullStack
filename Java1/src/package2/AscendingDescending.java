package package2;
import java.util.Arrays;

public class AscendingDescending {

	public static void main(String[] args) {
		int []a= {12,34,56,11,4,5};
		int []b= {3,89,45,34,25,67};
		int []c = new int[6];
		int i=0;
		while(i<a.length) {
			c[i]=a[i]+b[i];
			i++;
		}
		System.out.println(Arrays.toString(c));
		for(int j=0;j<c.length;j++) {
			for(int k=0;k<c.length;k++) {
		   if(c[j]<c[k]) {
			   int temp=c[j];
			   c[j]=c[k];
			   c[k]=temp;
		   }
		}
		
	}
	System.out.println(Arrays.toString(c));
	for(int j=0;j<c.length;j++) {
		for(int k=0;k<c.length;k++) {
	   if(c[j]>c[k]) {
		   int temp=c[j];
		   c[j]=c[k];
		   c[k]=temp;
	   }
	}
	}
	System.out.println(Arrays.toString(c));
}
}
