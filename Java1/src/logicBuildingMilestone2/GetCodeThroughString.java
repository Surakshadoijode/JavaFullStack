package logicBuildingMilestone2;
import java.util.*;

public class GetCodeThroughString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();

        String[] words = input1.split(" ");
        int sum = 0;

        // Step 1: Sum lengths of all words
        for (String word : words) {
            sum += word.length();
        }

        // Step 2: Reduce to single digit sum
        while (sum > 10) {
            int temp = sum;
            sum = 0;
            while (temp > 0) {
                int r = temp % 10;
                sum += r;
                temp /= 10;
            }
        }

        System.out.println(sum);
        sc.close();


	}

}
