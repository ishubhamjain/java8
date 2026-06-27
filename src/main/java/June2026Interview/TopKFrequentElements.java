package June2026Interview;

import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args) {

        int[] nums = {1,1,1,2,2,3};
        int k = 2;

        Map<Integer,Integer> map = new HashMap<>();

        for (int val : nums) {
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        Map<Integer,Integer> sortedMap = new LinkedHashMap<>();

        map.entrySet()
                .stream()
                .sorted(Map.Entry.<Integer,Integer>comparingByValue().reversed())
                .forEach(entry ->
                        sortedMap.put(entry.getKey(), entry.getValue()));

        System.out.println(sortedMap);

        int count = 0;
        for (Map.Entry<Integer,Integer> entry : sortedMap.entrySet()) {
            if (count == k)
                break;

            System.out.println(entry.getKey());
            count++;
        }
    }
}