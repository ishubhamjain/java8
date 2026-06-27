package June2026Interview;

import java.util.Arrays;

public class MoveZerostoEnd {
    public static void main(String[] args) {
        int[] arr = {1,0,5,0,3};

        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        for(int val : arr){
            System.out.print(val+",");
        }
    }
}
