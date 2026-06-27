package demo;

import java.util.ArrayList;
import java.util.HashSet;

public class DuplicateRemove {
    public static void main(String[] args) {
        int[] arr = {11,2,3,1,3,4,52,4};

        ArrayList<Integer> arrList = new ArrayList<>();
        HashSet<Integer> arrSet = new HashSet<>();

        for(int val : arr){
            if(!arrSet.add(val)){
                arrList.add(val);
            }
        }

        for(int val : arrList){
            System.out.println(val);
        }
    }
}
