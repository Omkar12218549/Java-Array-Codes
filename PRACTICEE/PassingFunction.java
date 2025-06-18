package PRACTICEE;

import java.util.Arrays;

public class PassingFunction {
    public static void main(String[] args) {
        int[] arr={11,22,11,2,33,2};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void change(int nums[]){
        nums[0]=99;
    }
}
