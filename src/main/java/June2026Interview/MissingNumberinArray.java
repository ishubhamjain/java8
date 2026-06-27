package June2026Interview;

import java.util.Arrays;

public class MissingNumberinArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5};

      //  System.out.println(arr.length);
        int n = arr.length+1;
      //  int n =5;

        int expected = n*(n+1)/2;
        int actual = Arrays.stream(arr).sum();

      //  Arrays.stream(arr).sum();

        System.out.println(expected-actual);
    }
}
