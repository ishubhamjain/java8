package June2026Interview;

import java.util.Arrays;
import java.util.Collections;

public class SortDescending {
    public static void main(String[] args) {
        Integer arr[] = {5,2,8,1};

        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println(Arrays.toString(arr));
    }
}
