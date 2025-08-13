package logicBuildingMilestone2;
import java.util.*;

public class FindStringCode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        sc.close();

        String[] words = input1.split(" ");
        String restr = "";

        for (String word : words) {
            char[] letters = word.toCharArray();
            int left = 0, right = letters.length - 1;
            int sum = 0; 

            while (left < right) {
                int leftValue = Character.toLowerCase(letters[left]) - 'a' + 1;
                int rightValue = Character.toLowerCase(letters[right]) - 'a' + 1;
                int diff = leftValue - rightValue;
                sum += Math.abs(diff);
                left++;
                right--;
            }

            // If odd length, add the middle letter value
            if (left == right) {
                sum += Character.toLowerCase(letters[left]) - 'a' + 1;
            }

            restr += sum;
        }
        int result = Integer.parseInt(restr);
        System.out.println(result);


	}

}
