package Class;

import java.util.Arrays;

public class bubbleShort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) { // Swap for descending order
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 22, 1, 22, 2, 3, 2};

        System.out.println("Original Array: " + Arrays.toString(arr));

        bubbleSort(arr); // Sort the array

        System.out.println("Sorted Array (Descending): " + Arrays.toString(arr));
    }
}
