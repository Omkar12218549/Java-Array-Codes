package ARRAY111;

public class Minelement {
    public static void main(String args[]){
        int arr[]={22,12,34,23,2};
        int min=arr[0];
        for(int num:arr){
            if(num<min){
                min=num;
            }
        }
        System.out.println(min);
    }
}
