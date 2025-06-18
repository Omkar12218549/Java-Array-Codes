package Array;

//public class Twood {
//    public static void main(String[] args) {
//
//
//        int nums[][] = {
//                {1,2,3},
//                {3,4,5},
//                {4,6,3}
//
//        };
//        for(int a[]:nums){
//            for(int b:a){
//                System.out.print(b+" ");
//            }
//            System.out.println();
//        }
//        System.out.println(nums.length);
//    }
//}
class Twood{
    public static void main(String[] args) {


    int arr[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
    };
    for(int a[]:arr){
        for(int b:a){
            System.out.print(b+" ");
        }
        System.out.println();
    }
        System.out.println(arr.length);
}
}