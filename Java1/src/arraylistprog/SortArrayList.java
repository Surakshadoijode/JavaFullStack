package arraylistprog;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class SortArrayList {

	public static void main(String[] args) {
		List<String> list_String=new ArrayList<String>();
		list_String.add("Red");
		list_String.add("Blue");
		list_String.add("Green");
		list_String.add("White");
		System.out.println(list_String);
		Collections.sort(list_String);
		System.out.println(list_String);

	}

}
