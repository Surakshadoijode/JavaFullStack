package streamapi;

import java.util.ArrayList;
import java.util.List;

public class min {

	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(20);
		l1.add(2);
		l1.add(45);
		l1.add(36);
		long l=l1.stream().max((x,y)-> x<y? 1:-1).get();
		System.out.println(l);

	}

}
