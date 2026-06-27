package June2026Interview;

import java.util.ArrayList;
import java.util.List;

public class LongestSubstringWithoutRepeatingCharacters2 {
    public static void main(String[] args) {
        String str = "abcabcdd";
        int start=0;
        int end=0;
        int maximum=0;

        List<Character> list = new ArrayList<>();

        while (end<str.length()){
            if(!list.contains(str.charAt(end))){
                list.add(str.charAt(end));
                end++;
                maximum=Math.max(maximum,list.size());
            } else {
                list.remove(Character.valueOf(str.charAt(start)));
                start++;
            }
        }
        System.out.println("maximum string = "+maximum);
    }
}
