package StriverRR.ARRAY;
import java.util.*;
public class ZeroMoveBruteForceMethod {

        public static int[] zeroMover(int arr[],int n){
            ArrayList<Integer> list=new ArrayList<>();
            for(int i=0;i<n;i++){
                if(arr[i]!=0){
                    list.add(arr[i]);
                }
            }
            int nz=list.size();
            for(int i=0;i<nz;i++){
                arr[i]=list.get(i);
            }
            for(int i=nz;i<n;i++){
                arr[i]=0;
            }
            return arr;
        }
        public static void main(String[] args) {
            int arr[]={1,0,3,0,4,0,5,0};
            int n=8;
            zeroMover(arr,n);
            for(int num:arr){
                System.out.print(num+" ");
            }






        }
    }

