package Array;

import java.util.ArrayList;

public class targetSumSubarray {

    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int j = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            while (sum > target && j < i) {
                sum -= arr[j++];
            }
            if (sum == target) {
                ans.add(j + 1); // 1-based index
                ans.add(i + 1); // 1-based index
                return ans;
            }
        }

        ans.add(-1);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int target = 12;
        ArrayList<Integer> result = subarraySum(arr, target);
        System.out.println(result);
    }
}
