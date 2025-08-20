package assesment1;

public class MajorityElements {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 2, 2, 2};

        int candidate = arr[0], count = 1;

        // Boyer-Moore Voting Algorithm
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == candidate) count++;
            else count--;

            if (count == 0) {
                candidate = arr[i];
                count = 1;
            }
        }

        // Verify majority
        count = 0;
        for (int num : arr) {
            if (num == candidate) count++;
        }

        if (count > arr.length / 2)
            System.out.println("Majority element: " + candidate);
        else
            System.out.println("No majority element");
    }
}
