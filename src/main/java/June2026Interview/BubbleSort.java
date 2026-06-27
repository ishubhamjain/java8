package June2026Interview;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        int[] newArr = sort(arr);

        for(int val : newArr){
            System.out.print(val+",");
        }
    }

    public static int[] sort(int[] arr){
        int len = arr.length;

        for(int i=0;i<len-1;i++){
            for(int j=0;j<len-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return  arr;
    }


}
