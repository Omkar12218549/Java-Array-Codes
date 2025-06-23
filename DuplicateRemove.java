package Array;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateRemove {
    public static int removedup(int[] arr) {
        if (arr.length == 0) return 0;
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                arr[i+1]=arr[j];
                i++;
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[7];
        for(int i=0;i<7;i++){
            arr[i]= sc.nextInt();
        }
        Arrays.sort(arr);
        int newLength=removedup(arr);
        for (int i=0;i<newLength;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
