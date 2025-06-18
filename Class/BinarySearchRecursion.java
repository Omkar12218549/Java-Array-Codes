package Class;

public class BinarySearchRecursion {

        public static int binarySearch(int[] arr, int start, int end, int target) {
            // Base case: If range is invalid, target is not in the array
            if (start > end) {
                return -1;
            }

            int mid = (start+end )/ 2; // Avoids integer overflow

            // Check if mid element is the target
            if (arr[mid] == target) {
                return mid;
            }

            // If target is smaller, search left half
            if (arr[mid] > target) {
                return binarySearch(arr, start, mid - 1, target);
            }

            // If target is larger, search right half
            return binarySearch(arr, mid + 1, end, target);
        }

        public static void main(String[] args) {
            int[] arr = {2, 4, 6, 8, 10, 12, 14, 16}; // Sorted array
            int target = 10;

            int result = binarySearch(arr, 0, arr.length - 1, target);

            if (result != -1) {
                System.out.println("Element found at index: " + result);
            } else {
                System.out.println("Element not found in the array.");
            }
        }
    }


