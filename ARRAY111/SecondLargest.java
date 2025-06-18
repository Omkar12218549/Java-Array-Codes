package ARRAY111;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[]={11,22,1,23,45,643,3,344,};
        int largest=arr[0];
        int selar=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                selar=largest;
                largest=arr[i];

            } else if (arr[i]>selar && arr[i]!=largest) {
                selar=arr[i];
            }
        }
        System.out.println(selar);
    }
}
