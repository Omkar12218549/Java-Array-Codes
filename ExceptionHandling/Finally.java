package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Finally {
    public static void main(String[] args) {
        int num=0;
        Scanner sc=new Scanner(System.in);

        try{
            num= sc.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("Alert!! input only numbers");
        }
        finally {// finally is execute irrespective of try-catch will execute or not
            sc.close();
        }
        System.out.println(num);
    }
}
