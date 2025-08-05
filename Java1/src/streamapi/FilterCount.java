package streamapi;
import java.util.*;

public class FilterCount {

	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(5);
		l1.add(16);
		l1.add(13);
		l1.add(7);
		long l2=l1.stream().filter(x-> x%2==0).count();
		System.out.println(l2);
				
	}

}
