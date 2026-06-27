package June2026Interview;

public class KadaneAlgorithm {
    public static void main(String[] args) {
        //Given an integer array, find the contiguous subarray having the largest sum and return that sum.
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

     //   int[] arr = {2, 1, 3, 4, 1, 2, 1, 5, 4};

        int[] positionval= new int[2];
        int max=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]>max){
                    max=arr[i]+arr[j];
                    positionval[0] = arr[i];
                    positionval[1] = arr[j];
                }
            }
        }

        System.out.println("max value = "+max);
        System.out.println("number 1 = "+positionval[0]);
        System.out.println("number 2 = "+positionval[1]);

    }
}
