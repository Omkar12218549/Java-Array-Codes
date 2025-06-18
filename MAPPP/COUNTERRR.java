package MAPPP;

import java.util.HashMap;
import java.util.Map;

public class COUNTERRR {
    public static void main(String[] args) {
        String word="My name is My name ar are are ar aa aa";
        Map<String,Integer> map=new HashMap<>();
        for(String ch:word.split(" ")){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
