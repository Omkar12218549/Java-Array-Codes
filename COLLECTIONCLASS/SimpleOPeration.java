package COLLECTIONCLASS;


import java.util.ArrayList;
import java.util.Collections;

public class SimpleOPeration {
    public static void main(String[] args) {
        ArrayList<Integer> lst=new ArrayList<>();
        lst.add(90);
        lst.add(87);
        lst.add(56);
        lst.add(85);
//        System.out.println(lst);
//        Collections.sort(lst);//++++++++++++++++++++++++
//        System.out.println(lst);
//
//        System.out.println(Collections.frequency(lst,85));
//
//        Collections.rotate(lst,3);
//        System.out.println(lst);
//
//       Collections.shuffle(lst);
//        System.out.println(lst);

        // +++++++++++++++++++ Binary Search
        int Index=Collections.binarySearch(lst,87);
        System.out.println("The index is: "+Index);



    }


}
