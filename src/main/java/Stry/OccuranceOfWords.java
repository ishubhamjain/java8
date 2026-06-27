package Stry;

import java.util.HashMap;

public class OccuranceOfWords {
    public static void main(String[] args) {
        // Declaring the String
        String str = "Alice is girl and Bob is boy";
        String[] arrStr = str.split(" ");

        HashMap<String,Integer> map = new HashMap<>();

        for(String val : arrStr){

            if(map.containsKey(val)){
                map.put(val, map.get(val)+1);
            }
            else {
                map.put(val,1);
            }

        }

        for(String val : map.keySet()){
            System.out.println(val +":"+ map.get(val));
        }



    }
}
