package Array;

import java.util.ArrayList;

public class ArrayListt {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(89);
        list.add(99);
        list.add(899);
        list.add(56);
        list.set(2,6999);
        list.remove(2);

        System.out.println(list);
        System.out.println(list.contains(8899));
        System.out.println(list.size());





    }
}
