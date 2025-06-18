package Class;

public class PalindromeArray {

        public static boolean isPalindrome(int[] arr, int start, int end) {
            // Base case: If pointers have met or crossed, array is a palindrome
            if (start >= end) {
                return true;
            }

            // If first and last elements are not the same, it's not a palindrome
            if (arr[start] != arr[end]) {
                return false;
            }

            // Recursive call to check the remaining subarray
            return isPalindrome(arr, start + 1, end - 1);
        }

        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 2, 1}; // Example input
            boolean result = isPalindrome(arr, 0, arr.length - 1);

            if (result) {
                System.out.println("The array is a palindrome.");
            } else {
                System.out.println("The array is NOT a palindrome.");
            }
        }
    }


