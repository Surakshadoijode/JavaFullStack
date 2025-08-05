package streamapi;
import java.util.*;

public class FilterForEach {

	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(9);
		l1.add(7);
		l1.add(6);
		l1.stream().filter(x-> x%2==0).forEach(x -> System.out.println(x+" "));

	}

}
