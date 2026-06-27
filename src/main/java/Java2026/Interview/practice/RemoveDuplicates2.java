package Java2026.Interview.practice;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates2 {
    public static void main(String[] args) {
        int[] arr= {1,2,2,4,6,7};

        Set<Integer> set = new LinkedHashSet<>();
        for(int num:arr){
            set.add(num);
        }

        System.out.println(set);
    }
}
