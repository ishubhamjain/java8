package Java2026.intervew1;

import java.util.HashSet;
import java.util.Set;

public class ArrayIntersection {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};

        Set<Integer> set = new HashSet<>();

        for(int num:arr1){
            set.add(num);
        }

        System.out.println("Intersection");

        for (int num : arr2){
            if(set.contains(num)){
                System.out.println(num);
            }
        }
    }
}
