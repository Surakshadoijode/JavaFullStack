package arraylistprog;

import java.util.ArrayList;
import java.util.List;

public class UpdatingArrayList {

	public static void main(String[] args) {
		List<String> list_String=new ArrayList<String>();
		list_String.add("Red");
		list_String.add("Blue");
		list_String.add("Black");
		list_String.add("White");
		System.out.println(list_String);
		list_String.set(3, "Green");
		System.out.println(list_String);
	}

}
