package arraylistprog;
import java.util.*;

public class InsertAtFirstPosition {

	public static void main(String[] args) {
		List<String> list_String=new ArrayList<String>();
		list_String.add("Red");
		list_String.add("Blue");
		list_String.add("Green");
		list_String.add("White");
		System.out.println(list_String);
		list_String.add(0,"Pink");
		list_String.add(3,"Black");
		System.out.println(list_String);
	}

}
