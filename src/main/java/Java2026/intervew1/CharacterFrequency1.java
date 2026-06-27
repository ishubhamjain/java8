package Java2026.intervew1;

import java.util.HashMap;



public class CharacterFrequency1 {
    public static void main(String[] args) {
        String str = "programming";

        HashMap<Character,Integer> map = new HashMap<>();

        for(char c : str.toCharArray()){
            if(map.containsKey(c)){
                map.put(c , map.get(c)+1);
            } else {
                map.put(c, 1);
            }
        }

        for(char r: map.keySet()){
            System.out.println(r+" : "+map.get(r));
        }


    }
}
