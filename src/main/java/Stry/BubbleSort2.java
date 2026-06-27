package Stry;

public class BubbleSort2 {
    public static void main(String[] args) {
        int[] arr = sort(new int[]{22,4,67,11,23});
        for(int val : arr){
            System.out.println(val);
        }
    }

    public static int[] sort(int[] arr){
        int len= arr.length;

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j< arr.length-1;j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
