package String;
import java.util.*;
public class Allsubstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your String");
        String str= sc.nextLine();
        for(int i=0;i<=3;i++){
            for(int j=i+1;j<=4;j++){
                System.out.print(str.substring(i,j)+" ");
            }
        }
    }
}
