package Stry;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {23,4,22,4,67,88,43,2,33};
        System.out.println();
        for (int val: sort(arr)){
            System.out.print(val+" ");
        }
    }

    public static int[] sort(int[] arr){
        int len = arr.length;

        for(int i=0;i<len;i++){
            for(int j=0;j<len-1;j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return  arr;
    }
}
