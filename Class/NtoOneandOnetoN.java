package Class;

public class NtoOneandOnetoN {

        // Function to print from n to 1
        public static void printDescending(int n) {
            if (n == 0) return; // Base case
            System.out.print(n + " ");
            printDescending(n - 1); // Recursive call for n-1
        }

        // Function to print from 1 to n
        public static void printAscending(int n, int start) {
            if (start > n) return; // Base case
            System.out.print(start + " ");
            printAscending(n, start + 1); // Recursive call for next number
        }

        public static void main(String[] args) {
            int n = 5; // Example input

            // Print n to 1
            System.out.print("Descending Order: ");
            printDescending(n);
            System.out.println(); // New line

            // Print 1 to n
            System.out.print("Ascending Order: ");
            printAscending(n, 1);
            System.out.println(); // New line
        }
    }


