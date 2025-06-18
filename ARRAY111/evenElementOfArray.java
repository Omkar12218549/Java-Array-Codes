package ARRAY111;

public class evenElementOfArray {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,4};

        for(int num:arr){
            if(num%2==0){
                System.out.println(num);
            }
        }
    }
}
