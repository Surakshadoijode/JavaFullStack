package streamapi;
import java.util.*;

public class reduce {

	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(40);
		l1.add(50);
		l1.add(30);
		l1.add(80);
		int sum=l1.stream().reduce(0, Integer::sum);
		System.out.println(sum);
	}

}
