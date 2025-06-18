package String;
import java.util.*;

public class Reev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the string");
        String str = sc.nextLine();
        int LowerCounter=0;
        int UpperCounter=0;

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isLowerCase(ch)){
                LowerCounter++;

            } else if (Character.isUpperCase(ch)) {
                UpperCounter++;


            }
        }
        System.out.println("Number Small Letter Letters"+LowerCounter);
        System.out.println("Number Capital Letter Letters"+UpperCounter);



    }

}