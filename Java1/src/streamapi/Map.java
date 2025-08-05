package streamapi;
import java.util.*;

public class Map {

	public static void main(String[] args) {
		List<String> str=new ArrayList<String>();
		str.add("Wipro");
		str.add("Technology");
		str.add("Management");
		str.stream().map(String::toUpperCase).forEach(System.out::println);

	}

}
