package PRACTICEE;

public class sout {
    public static int Maxval(int[] arr,int Start,int End){
        int max=arr[Start];
        for(int i=Start;i<End;i++){
            if(arr[i]>max){
                max=arr[i];

            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr={23,222,322,33,233,233,222};
        int result=Maxval(arr,0,2);
        System.out.println(result);


    }
}
