package Array;
import java.util.*;
public class kthlargestElkemnt {
    public static void main(String[] args) {
        // Create scanner object for input
        Scanner sc = new Scanner(System.in);

        // Read number of athletes (N)
        int N = sc.nextInt();

        // Read the scores of the athletes
        int[] scores = new int[N];
        for (int i = 0; i < N; i++) {
            scores[i] = sc.nextInt();
        }

        // Read the value of k
        int k = sc.nextInt();

        // Sort the array in descending order
        Arrays.sort(scores);
        // Since we want the kth largest, we reverse the array or access the kth largest element directly
        int kthLargest = scores[N - k];

        // Output the kth largest score
        System.out.println(kthLargest);
    }
}
