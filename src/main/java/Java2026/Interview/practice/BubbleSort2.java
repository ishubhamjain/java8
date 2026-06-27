package Java2026.Interview.practice;

public class BubbleSort2 {

    public static void main(String[] args) {
        BubbleSort2 bubbleSort = new BubbleSort2();
        bubbleSort.bubbleSort(new int[]{34,34,2,45,53,1});
    }

    public void bubbleSort(int[] arr){
        int len = arr.length;

        for(int i=0;i<len-1;i++){
            for(int j=0;j<len-i-1;j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int val:arr){
            System.out.print(val+" ");
        }
    }
}
