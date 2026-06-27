package June2026Interview;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int val : arr1){
            arrayList.add(val);
        }

        for(int val : arr2){
            arrayList.add(val);
        }

        arrayList.forEach(a -> System.out.print(a+","));
    }
}
