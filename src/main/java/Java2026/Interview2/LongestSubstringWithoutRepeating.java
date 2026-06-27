package Java2026.Interview2;


import java.util.LinkedHashSet;
import java.util.Random;

public class LongestSubstringWithoutRepeating {
    public static void main(String[] args) {

        String str = "Welcome to my Interview";
        String space="";
        LinkedHashSet<String> set = new LinkedHashSet<>();

        Random r = new Random();

        for(int i=0;i<=str.length()-1;i++){
            String val = String.valueOf(str.charAt(i));
            if(val.contains(" ")) {
            //    space += val + " ";
            //    val = space;
            //    val = String.valueOf(r.nextInt(1));
            }
                set.add(val);
        }

        System.out.println(set);

        for(String ch : set){
            System.out.print(ch);
        }


    }
}
