package StriverRR.ARRAY;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,22,23,3,3};
        int num=9;

        boolean founded=false;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==num){
                System.out.println(i+1);
                founded=true;
                break;
            }

        }
        if(!founded){
            System.out.println("The given element is not present");
        }

    }
}
