package arraylistprog;

import java.util.ArrayList;
import java.util.List;

public class CheckingElement {

	public static void main(String[] args) {
		List<String> list_String=new ArrayList<String>();
		list_String.add("Red");
		list_String.add("Blue");
		list_String.add("Black");
		list_String.add("White");
		System.out.println(list_String);
		if(list_String.contains("Black")) {
			System.out.println("Element Found");
		}else {
			System.out.print("Element not Found");
		}

	}

}
