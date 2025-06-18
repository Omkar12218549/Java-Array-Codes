package NIGHT1;

public class countingUp {

        public static void main(String[] args) {
            int start = 1;
            int end = 5;
            countUp(start, end);
        }

        static void countUp(int start, int end) {
            if (start > end) return; // Base case
            countUp(start + 1, end); // Recursive call first (increasing)
            System.out.println(start); // Print after recursive call
        }

}

