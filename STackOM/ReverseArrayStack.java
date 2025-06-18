package STackOM;

public class ReverseArrayStack {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10,11};
        int stack[]=new int[arr.length];
        int top=-1;


        // push all the element of the array to stack
        for(int i=0;i< arr.length;i++){
            stack[++top]=arr[i];
        }

        //pop all the element of the stack back to the array

        for(int i=0;i< arr.length;i++){
            arr[i]=stack[top--];
        }

        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
