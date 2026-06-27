package Java2026.intervew1;

import java.util.Collections;
import java.util.HashMap;

public class CharacterFrequency {
    public static void main(String[] args) {

        String str = "programming";

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        // Print frequencies
        for (char ch : map.keySet()) {
            System.out.println(ch + " : " + map.get(ch));
        }


    }
}
