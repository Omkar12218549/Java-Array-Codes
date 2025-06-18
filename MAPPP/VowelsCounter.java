package MAPPP;
import java.util.*;
public class VowelsCounter {
    public static void main(String[] args) {
        String text="Omkar Yadav";
        Map<Character, Integer> vowelCounter=new HashMap<>();
        Set<Character> vowels=new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));

        for(char ch:text.toCharArray()){
            if(vowels.contains(ch)){
                vowelCounter.put(ch,vowelCounter.getOrDefault(ch,0)+1);
            }
        }
        System.out.println(vowelCounter);
    }
}
