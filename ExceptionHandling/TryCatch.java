package ExceptionHandling;


//There are three types of error 1-Syntex Error 2-Logical error 3-Runtime Error(We use exception handling in this type of error)



public class TryCatch {
    public static void main(String[] args) {
        int num1=8;//normal Statement
        int num2=0;//normal Statement
        int result=0;


        try{
        result=num1/num2;//critical statement
            System.out.println("Try block executed");
        }
        catch (ArithmeticException e){
            System.out.println("Division with zero is not possible "+e);
        }
        System.out.println(result);
        System.out.println("Bye");


    }
}
