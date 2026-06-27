package Stryker;

import java.util.Arrays;

public class FindTheMissingNumber2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5};

        int n = arr.length+1;

        int expected = n*(n+1)/2;
        int actual = Arrays.stream(arr).sum();
        System.out.println(expected-actual);
    }
}
