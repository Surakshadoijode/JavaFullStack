package arraylistprog;

import java.util.ArrayList;
import java.util.List;

public class RetrivingElement {

	public static void main(String[] args) {
		List<String> list_String=new ArrayList<String>();
		list_String.add("Red");
		list_String.add("Blue");
		list_String.add("Green");
		list_String.add("White");
		System.out.println(list_String);
		String element=list_String.get(2);
		System.out.println(element);
		element=list_String.get(1);
		System.out.println(element);
	}

}
