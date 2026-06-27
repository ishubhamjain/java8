package Java2026.Interview.practice;

import java.util.*;

public class FirstNonRepeating {
    public static void main(String[] args) {
        String str = "aabbcdde";

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}
