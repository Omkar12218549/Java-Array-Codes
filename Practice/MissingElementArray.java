package Practice;

import java.util.Scanner;

public class MissingElementArray {
    public static int isMissing(int[] arr){
        int n= arr.length+1;// since one number is missing
        long ExpectedSum=(long) n*(n+1)/2;
        long actualSum=0;

        for(int num:arr){
            actualSum +=num;
        }
        return (int) (ExpectedSum-actualSum);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of element in array");
        int N= sc.nextInt();

        //initializing the array
        int[] arr=new int[N];
        // Reading the element of array
        for(int i=0;i<N;i++){
            arr[i]= sc.nextInt();
        }
//        MissingElementArray obj=new MissingElementArray();
        int missing=isMissing(arr);
        System.out.println(missing);
        sc.close();
    }

}
