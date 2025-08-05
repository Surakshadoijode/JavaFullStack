package streamapi;
import java.util.*;
import java.util.stream.Collectors;

public class FilterCollect2 {

	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(-5);
		l1.add(15);
		l1.add(-2);
		l1.add(-7);
		List<Integer> l2=l1.stream().filter(x-> x<0).collect(Collectors.toList());
		System.out.println(l1);
		System.out.println(l2);
	}

}
