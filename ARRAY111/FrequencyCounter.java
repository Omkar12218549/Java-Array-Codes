package ARRAY111;

import java.util.*;

public class FrequencyCounter {
    public static void main(String[] args) {


        int arr[] = {11, 22, 11, 22, 22, 2, 33, 33};
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        System.out.println(map);
    }
}
