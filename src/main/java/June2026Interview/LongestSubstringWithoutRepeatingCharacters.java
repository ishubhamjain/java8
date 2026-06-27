package June2026Interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String str = "abcabcdd";
        int start = 0;
        int end  = 0;
        int maxLength = 0;

        List<Character> list = new ArrayList<>();
        while(end< str.length()){
            if(!list.contains(str.charAt(end))){
                list.add(str.charAt(end));
                end++;
                maxLength=Math.max(maxLength,list.size());
            }else {
                list.remove(Character.valueOf(str.charAt(start)));
                start++;
            }
        }
        System.out.println("maximum length ="+maxLength);
    }
}

