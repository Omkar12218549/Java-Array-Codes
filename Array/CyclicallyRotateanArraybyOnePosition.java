package Array;

import java.util.Scanner;

public class CyclicallyRotateanArraybyOnePosition {
    public static void rotatebyOne(int arr[]){
        int n=arr.length;
        int last=arr[n-1];//store last elemnt
        for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=last;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        int arr[]=new int[d];
        for(int i=0;i<d;i++){
            arr[i]= sc.nextInt();
        }
        rotatebyOne(arr);
        for(int num:arr){
            System.out.print(num+" ");
        }

    }


}
