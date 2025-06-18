package PRACTICEE;

import java.util.Arrays;

public class MultidimensionalArray {
    public static void main(String[] args) {


    int[][] arr={
            {12,2,23},
            {2,3},
            {34,6,78}

    } ;
    //input
        for(int row=0;row<arr.length;row++){
//            for(int col=0;col<arr[row].length;col++){
                System.out.println(Arrays.toString(arr[row]));

//            }
        }



//    //output
//    for(int row=0;row< arr.length;row++){
//        System.out.println(Arrays.toString(arr));
//    }

}
}
