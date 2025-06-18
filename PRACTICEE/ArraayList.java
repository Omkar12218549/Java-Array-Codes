package PRACTICEE;
import java.util.*;

public class ArraayList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList <Integer> list=new ArrayList<>();
        System.out.println("Enter five Integer: ");
        for (int i=0;i< 5;i++){
            list.add(sc.nextInt());
//            System.out.println(list);
        }
        System.out.println("ArrayLIst ELemnt");
        for (int i=0;i< list.size();i++){
            System.out.print(list.get(i)+" ");
        }


    }
}
