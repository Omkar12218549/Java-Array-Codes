package MAPPP;
import java.util.*;
public class DigitCounter {
    public static void main(String[] args) {
        int number = 123431232;
        Map<Character,Integer> digicounter=new HashMap<>();
        String numStr=Integer.toString(number);


        for(char ch:numStr.toCharArray()){
            digicounter.put(ch,digicounter.getOrDefault(ch,0)+1);
        }
        System.out.println(digicounter);

    }
}
