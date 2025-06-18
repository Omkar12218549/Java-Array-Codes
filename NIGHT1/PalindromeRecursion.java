package NIGHT1;

public class PalindromeRecursion {

        static boolean isPalindrome(String s) {
            if (s.length() <= 1) return true;  // Base case
            if (s.charAt(0) != s.charAt(s.length() - 1)) return false;
            return isPalindrome(s.substring(1, s.length() - 1));
        }

        public static void main(String[] args) {
            int num = 121;
            System.out.println(num + " is palindrome? " + isPalindrome(Integer.toString(num)));
        }
    }


