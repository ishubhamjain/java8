package Stry;

public class SumofTwoNumber {
    public static void main(String[] args) {

       int[] val = twoSum(new int[]{3,21,11,11,23},44);
        System.out.println(val[0]+"+"+val[1]);
    }

    public static int[] twoSum(int[] arr,int target){
        int[] position = new int[2];
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    position[0] = arr[i];
                    position[1] = arr[j];
                }
            }
        }
        return position;
    }
}
