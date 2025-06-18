package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class listIterator {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add(100);
        al.add(20);
        al.add(50);
        al.add(140);
        System.out.println(al);
        Iterator itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        ListIterator litr= al.listIterator(al.size());
        while(litr.hasPrevious()){
            System.out.print(litr.previous()+" ");
        }




    }
}
