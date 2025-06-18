package MAPPP;

import java.util.*;

public class MostFrequentCharacter {
    public static void main(String[] args) {


        String str = "assassination";
        Map<Character, Integer> freq = new HashMap<>();

       for(char ch:str.toCharArray()){
           freq.put(ch,freq.getOrDefault(ch,0)+1);

            }
        char Mostfrequent=' ';
        int Maxcount=0;
//        for(Map.Entry<Character,Integer> entry: freq.entrySet()){
//            if(entry.getValue() > Maxcount){
//                Maxcount=entry.getValue();
//                Mostfrequent= entry.getKey();
//            }
        for(Map.Entry<Character, Integer> entry:freq.entrySet()){
            if(entry.getValue()>Maxcount){
                Maxcount=entry.getValue();
                Mostfrequent= entry.getKey();
            }


        }
        System.out.println(Mostfrequent);
        System.out.println(Maxcount);
    }
}
