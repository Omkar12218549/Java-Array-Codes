package StriverRR.ARRAY;
import java.util.*;
import java.util.List;

public class UnionOftwoArray {
    public static List<Integer> sortedArray(List<Integer>a,List<Integer>b){
        Set<Integer> set=new HashSet<>();
        set.addAll(a);
        set.addAll(b);

        return new ArrayList<>(set);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Eneter the size of first list");
        int n1= sc.nextInt();
        List <Integer> a=new ArrayList<>();
        System.out.println("Eneter the element of first list");
        for(int i=0;i<n1;i++){
            a.add(sc.nextInt());
        }
        System.out.println("Eneter the size of second list");
        int n2= sc.nextInt();
        List <Integer> b=new ArrayList<>();
        System.out.println("Eneter the element of second list");
        for(int i=0;i<n2;i++){
            b.add(sc.nextInt());
        }
        List<Integer> result=sortedArray(a,b);
        System.out.println(result);

    }
}
