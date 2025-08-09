package assesments;

public class FindPassword {

    // Function to check if a number is stable
    public static boolean isStable(int num) {
        String str = String.valueOf(num);
        int[] freq = new int[10];

        // Count digit frequencies
        for (char ch : str.toCharArray()) {
            freq[ch - '0']++;
        }

        int commonFreq = 0;

        // Find the first non-zero frequency
        for (int f : freq) {
            if (f != 0) {
                commonFreq = f;
                break;
            }
        }

        // Check if all non-zero frequencies are equal
        for (int f : freq) {
            if (f != 0 && f != commonFreq) {
                return false; // Not stable
            }
        }
        return true; // Stable
    }

    public static int findPassword(int input1, int input2, int input3, int input4, int input5) {
        int stableCount = 0;
        int unstableCount = 0;

        int[] inputs = {input1, input2, input3, input4, input5};

        for (int num : inputs) {
            if (isStable(num)) {
                stableCount++;
            } else {
                unstableCount++;
            }
        }

        return (unstableCount * 10) + stableCount;
    }

    public static void main(String[] args) {
        // Example
        int password = findPassword(12, 1313, 122, 678, 898);
        System.out.println("Password: " + password); // Output: 23
    }
}
