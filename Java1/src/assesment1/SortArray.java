package assesment1;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 6};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("Sorted array: ");
        for (int num : arr) System.out.print(num + " ");
    }
}
