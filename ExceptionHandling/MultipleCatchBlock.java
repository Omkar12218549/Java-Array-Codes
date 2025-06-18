package ExceptionHandling;

public class MultipleCatchBlock {
    public static void main(String[] args) {
        int num1=8;
        int num2=6;
        int[] arr={1,2,3,4,5};
        String str="om";
        int result=0;

        try{
            result=num1/str.length();
            System.out.println(arr[9]);
        }
        catch(NullPointerException e){
            System.out.println("The value given to string should be not null"+e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in your limit"+e);
        }
        System.out.println(result);
        System.out.println("Message OK OK OK ");

    }
}
