package MAPPP;
import java.util.*;
public class MyMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"Omkar");
        map.put(2,"Alok");
        System.out.println(map);
        for (Map.Entry<Integer, String> entry: map.entrySet()){
            System.out.println("Key: "+entry.getKey()+", Value :"+entry.getValue());
        }
    }
}
