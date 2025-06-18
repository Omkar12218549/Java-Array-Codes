package MAPPP;
import java.util.*;
public class FreQuencyCounting {
    public static void main(String[] args) {
        String str="Omkar Yadav";
        Map<Character, Integer> freqmap=new HashMap<>();

        for(char ch:str.toCharArray()){
            freqmap.put(ch,freqmap.getOrDefault(ch,0)+1);
        }
        System.out.println(freqmap);
    }
}
