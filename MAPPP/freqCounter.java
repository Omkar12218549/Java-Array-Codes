package MAPPP;
import java.util.*;
public class freqCounter {
    public static void main(String[] args) {
        String str="omk_ ar";
        TreeMap<Character,Integer> map=new TreeMap<>();

        for(char ch:str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);

        }
//        System.out.println(map);
      for(Map.Entry<Character,Integer> entry:map.entrySet()){
          System.out.println(entry.getKey()+":"+entry.getValue());
      }



    }
}
