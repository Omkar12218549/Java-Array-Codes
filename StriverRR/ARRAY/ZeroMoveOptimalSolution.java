package StriverRR.ARRAY;

import java.util.Map;

public class ZeroMoveOptimalSolution {
    public static void Swap(int arr[],int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;

    }
    public static void Mover(int arr[],int n){
        n= arr.length;
        int j=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        for(int i=j+1;i<n;i++){
            if(arr[i]!=0){
                Swap(arr,i,j);
                j++;

            }
        }

    }

    public static void main(String[] args) {
        int arr[]={1,2,0,4,0,3,0,0,3,0};
        int n=10;
        Mover(arr,n);
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
