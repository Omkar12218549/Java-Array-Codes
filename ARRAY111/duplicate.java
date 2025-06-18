package ARRAY111;

import java.util.Arrays;

public class duplicate {
    public static int Duplicate(int[] ar) {

        int i=0;
        for(int j=1;j< ar.length;j++){
            if(ar[i]!=ar[j]){
                ar[i+1]=ar[j];
                i++;
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int arr[]={11,22,11,33,44,33,44};
        Arrays.sort(arr);
        int newIndex=Duplicate(arr);
        for(int i=0;i< newIndex;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
