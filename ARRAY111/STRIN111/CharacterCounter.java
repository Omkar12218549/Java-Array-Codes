package ARRAY111.STRIN111;

import java.util.HashMap;
import java.util.*;

public class CharacterCounter {
    public static char firstUnique(String str) {

        Map<Character,Integer> map=new LinkedHashMap<>();
        for(char ch:str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);

        }
       for(char ch:map.keySet()){
           if(map.get(ch)==1){
               return ch;
           }
       }
       return '_';
    }

    public static void main(String[] args) {
        System.out.println(firstUnique("apple"));
    }
}
