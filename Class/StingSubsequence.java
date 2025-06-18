package Class;

public class StingSubsequence {

        public static void findSubsequences(String str, String current, int index) {
            // Base case: If we have processed all characters, print the subsequence
            if (index == str.length()) {
                System.out.println(current);
                return;
            }

            // Recursive case 1: Include the current character
            findSubsequences(str, current + str.charAt(index), index + 1);

            // Recursive case 2: Exclude the current character
            findSubsequences(str, current, index + 1);
        }

        public static void main(String[] args) {
            String input = "abc"; // Example input
            System.out.println("All Subsequences:");
            findSubsequences(input, "", 0);
        }
}



