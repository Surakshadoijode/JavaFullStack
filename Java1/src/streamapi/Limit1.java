package streamapi;
import java.util.stream.Stream;

public class Limit1 {
	public static void main(String args[]) {
		Stream.iterate(0, x-> x+2).limit(10).forEach(System.out::println);
		
	}

}
