package Array;
import java.util.*;
public class SecondLargest
{
    public static int[] SecondLargestt(int arr[]){
        int largest=arr[0];
        int SecondLargest=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                SecondLargest=largest;
                largest=arr[i];
            }else if(arr[i]>SecondLargest && arr[i]!=largest){
                SecondLargest=arr[i];
            }
        }
        return new int[]{SecondLargest,largest};
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        System.out.println("Enter the element of the array");
        //initializing the array
        int arr[]=new int[n];

        //reading the element of the array
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int ans[]=SecondLargestt(arr);
        System.out.println(ans[0]+" "+ans[1]);


    }
}