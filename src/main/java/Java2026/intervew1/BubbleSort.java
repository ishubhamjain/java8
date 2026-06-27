package Java2026.intervew1;

public class BubbleSort {
    public static void main(String[] args) {
        bubble(new int[]{11,2,3,45,4});
    }

    public static void bubble(int[] arr){

        int len = arr.length;

        for(int i=0;i<len-1;i++){
            for(int j=0;j<len-i-1;j++){

                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int n : arr){
            System.out.println(n);
        }
    }
}
