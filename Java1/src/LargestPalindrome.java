package multithreading;
import java.util.*;

public class LargestPalindrome {
	public static int charsToRemoveForPalindrome(String input1) {
        input1 = input1.toLowerCase();
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : input1.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        int oddCount = 0;
        for (int count : freqMap.values()) {
            if (count % 2 != 0) {
                oddCount++;
            }
        }
        if (oddCount == input1.length()) {
            return -1;
        }
        if (oddCount <= 1) {
            return 0;
        }
        return oddCount - 1;
    }

	public static void main(String[] args) {
		System.out.println(charsToRemoveForPalindrome("Template")); // 3
        System.out.println(charsToRemoveForPalindrome("Magma"));    // 0
        System.out.println(charsToRemoveForPalindrome("Victory"));  // -1
	}

}
