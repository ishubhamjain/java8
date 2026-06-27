package Java2026.Interview.practice;

public class BubbleSort {

    public static void main(String[] args) {
        BubbleSort sort = new BubbleSort();
        sort.bubbleSort(new int[]{21,4,2,5,6,8});
    }

    public void bubbleSort(int[] arr){
        int len = arr.length;

        for(int i=0;i<=len-1;i++){
            for(int j=0;j<len-i-1;j++){

                if(arr[j]>arr[j+1]) {

                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int a:arr){
            System.out.print(a+ " ");
        }

    }
}
