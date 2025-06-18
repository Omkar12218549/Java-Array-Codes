package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println("Enter five element in an array");
        for(int i=0;i<5;i++){
            list.add(sc.nextInt());
        }
        //reading the element of the array list
        System.out.println("The elements of the arrayLists are: ");
        for (int i=0;i< list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
