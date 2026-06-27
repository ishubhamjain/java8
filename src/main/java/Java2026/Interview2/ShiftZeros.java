package Java2026.Interview2;

public class ShiftZeros {
    public static void main(String[] args) {
        int[] arr = {1, 0, 3, 0, 5, 0, 7};
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        for(int val : arr){
            System.out.print(val+" ");

        }
    }
}
