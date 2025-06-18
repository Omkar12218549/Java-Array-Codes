package MAPPP;
import java.util.*;
public class WordCounter {
    public static void main(String[] args) {
        String Sentence="apple apple oranges apple oranges banana";
        Map<String, Integer> wordcount=new HashMap<>();
        for(String word:Sentence.split(" ")){
            wordcount.put(word,wordcount.getOrDefault(word,0)+1);
        }
        System.out.println(wordcount);
    }
}
