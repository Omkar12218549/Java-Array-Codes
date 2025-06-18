package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        for (int i=0;i<5;i++){
            list.add(sc.nextInt());
        }
//        get item at any index
        for(int i=0; i<5;i++){
            System.out.println(list.get(2));
        }
        System.out.println(list);
    }
}
