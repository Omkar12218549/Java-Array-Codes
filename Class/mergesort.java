package Class;
import java.util.*;
public class mergesort {



    public static void merge(int[] arr, int start, int mid, int end) {
        // Sizes of left and right subarrays
        int leftSize = mid - start + 1;
        int rightSize = end - mid;

        // Create temporary arrays
        int[] left = new int[leftSize];
        int[] right = new int[rightSize];

        // Copy elements to left array using for loop
        for (int i = 0; i < leftSize; i++) {
            left[i] = arr[start + i];
        }

        // Copy elements to right array using for loop
        for (int j = 0; j < rightSize; j++) {
            right[j] = arr[mid + 1 + j];
        }

        // Merge the two sorted arrays
        int i = 0, j = 0, k = start;
        while (i < leftSize && j < rightSize) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements from left array using for loop
        for (; i < leftSize; i++, k++) {
            arr[k] = left[i];
        }

        // Copy remaining elements from right array using for loop
        for (; j < rightSize; j++, k++) {
            arr[k] = right[j];
        }
    }

    // Recursive Merge Sort function
    public static void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;

            // Recursively sort first and second halves
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);

            // Merge the sorted halves
            merge(arr, start, mid, end);
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7}; // Example input
        int n = arr.length;

        System.out.println("Original array:");
        System.out.println(Arrays.toString(arr));

        mergeSort(arr, 0, n - 1); // Call merge sort

        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(arr));
    }
    }


