package streamapi;
import java.util.*;
import java.util.stream.Collectors;

public class FilterCollect1 {

	public static void main(String[] args) {
		List<Integer> l1= new ArrayList<Integer>();
		l1.add(3);
		l1.add(4);
		l1.add(8);
		List<Integer> l2=l1.stream().filter(x-> x%2==0).collect(Collectors.toList());
		System.out.println(l1);
		System.out.println(l2);

	}

}
