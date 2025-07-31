package arraylistprog;
import java.util.*;

public class ArrayListIteration {

	public static void main(String[] args) {
		List<String> list= new ArrayList<String>();
		list.add("Red");
		list.add("Black");
		list.add("Orange");
		list.add("Blue");
		list.add("White");
		list.add("Green");
		System.out.println(list);
		for (String element:list) {
			System.out.println(element);
		}

	}

}
