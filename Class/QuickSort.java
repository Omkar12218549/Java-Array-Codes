package Class;

public class QuickSort {

        // Function to partition the array
        public static int partition(int[] arr, int start, int end) {
            int pivot = arr[end]; // Choosing the last element as pivot
            int i = start - 1; // Index for smaller elements

            for (int j = start; j < end; j++) {
                if (arr[j] < pivot) {
                    i++;
                    // Swap arr[i] and arr[j]
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

            // Swap pivot into its correct position
            int temp = arr[i + 1];
            arr[i + 1] = arr[end];
            arr[end] = temp;

            return i + 1; // Return pivot index
        }

        // QuickSort function (recursive)
        public static void quickSort(int[] arr, int start, int end) {
            if (start < end) {
                int pivotIndex = partition(arr, start, end);

                // Recursively sort elements before and after the partition
                quickSort(arr, start, pivotIndex - 1);
                quickSort(arr, pivotIndex + 1, end);
            }
        }

        public static void main(String[] args) {
            int[] arr = {10, 7, 8, 9, 1, 5}; // Example input
            int n = arr.length;

            System.out.println("Original array:");
            printArray(arr);

            quickSort(arr, 0, n - 1); // Call quicksort

            System.out.println("Sorted array:");
            printArray(arr);
        }

        // Helper function to print array
        public static void printArray(int[] arr) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }


