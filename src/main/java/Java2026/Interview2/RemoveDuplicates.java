package Java2026.Interview2;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = new int[]{2,2,3,56,7,5,2};

        Set<Integer> set = new HashSet<>();
        for(int num : arr){
            set.add(num);
        }

        for(int num:set){
            System.out.println(num);
        }


    }
}
