package reviseJan2025;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort.sort(arr);
    }

    public void sort(int[] arr){

        int len = arr.length;

        for(int i=0; i< len-1;i++){
            for(int j=0;j<len-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int value : arr){
            System.out.println(value);
        }

    }
}
