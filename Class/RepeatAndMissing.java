package Class;

public class RepeatAndMissing {
    public static void findRepeatingAndMissing(int[] arr, int n) {
        int[] freq = new int[n + 1];
        int repeating = -1, missing = -1;

        // Initialize frequency array
        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }

        // Find repeating and missing numbers
        for (int i = 1; i <= n; i++) {
            if (freq[i] == 0) {
                missing = i;
            } else if (freq[i] > 1) {
                repeating = i;
            }
        }

        System.out.println("Repeating number is: " + repeating);
        System.out.println("Missing number is: " + missing);
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 6, 2, 1, 1};
        int n = arr.length;

        findRepeatingAndMissing(arr, n);
    }
}