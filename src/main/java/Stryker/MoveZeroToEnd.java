package Stryker;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        int[] arr = {2,4,2,0,4,32,4,3,5,0,7,9};

        int j=0;
        for(int i=0;i<=arr.length-1;i++){
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
