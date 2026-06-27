package Java2026.Interview2;

import java.util.HashMap;

public class CharacterFrequency {
    public static void main(String[] args) {
        String str = "programming";

        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch : str.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else {
                map.put(ch,1);
            }
        }

        for(char r: map.keySet()){
            System.out.println(r+" "+map.get(r));
        }
    }
}
