package Java2026.intervew1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        List<Integer> reverse = new ArrayList<Integer>();

        for(int i=arr.length-1;i>=0;i--){
            reverse.add(arr[i]);
        }
        System.out.println(reverse);
    }
}
