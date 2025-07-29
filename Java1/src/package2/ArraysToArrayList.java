package package2;
import java.util.ArrayList;

import java.util.Arrays;

public class ArraysToArrayList {

	public static void main(String[] args) {
		String []arr= { "apple","banana","Orange","Mango","Pumpkin"};
		ArrayList<String> list=new ArrayList<String>(Arrays.asList(arr));
		System.out.println(list);
	}

}
