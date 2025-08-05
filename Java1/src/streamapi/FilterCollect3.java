package streamapi;
import java.util.*;
import java.util.stream.Collectors;

public class FilterCollect3 {

	public static void main(String[] args) {
		List<String> st1=new ArrayList<String>();
		st1.add("egg");
		st1.add("chair");
		st1.add("table");
		List<String> st2=st1.stream().filter(x -> x.contains("a")).collect(Collectors.toList());
		System.out.println(st1);
		System.out.println(st2);
		

	}

}
