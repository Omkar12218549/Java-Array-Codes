package ARRAY111.STRIN111;
import java.util.*;
public class reverser {
    public static void main(String[] args) {
        String str="omkar";
        char[] arr=str.toCharArray();
//        Arrays.sort(arr);
//        System.out.println(arr);
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
