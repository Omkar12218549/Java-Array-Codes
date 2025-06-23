package Array;

class ArrayRotation {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;  // Handle cases where k > nums.length
        reverser(nums, 0, nums.length - 1);  // Reverse entire array
        reverser(nums, 0, k - 1);  // Reverse first k elements
        reverser(nums, k, nums.length - 1);  // Reverse remaining elements
    }

    public void reverser(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;  // Move forward
            end--;    // Move backward
        }
    }

    public static void main(String[] args) {
        ArrayRotation sol = new ArrayRotation();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        sol.rotate(nums, k);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
