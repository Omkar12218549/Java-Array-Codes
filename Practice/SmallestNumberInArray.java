package Practice;

public class SmallestNumberInArray {
    public static void main(String[] args) {


        int[] arr = {1, 2, 22, 2, 998};
        int largest = arr[0];
        int Smallest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest){
                largest=arr[i];
            } else if (arr[i]<Smallest) {
                Smallest=arr[i];
                
            }

        }
        System.out.println(largest);
        System.out.println(Smallest);
    }
}
