package Stry;


import java.util.Arrays;

public class findSecondLargest {
    public static void main(String[] args) {
        int[] arr = {11,2,4,2,56,76,54,3,4};

        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]);
    }
}
