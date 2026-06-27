package Java2026.Interview2;

public class SumOfTwo {
    public static void main(String[] args) {
        int[] position = twoSum(new int[]{2,1,4,22,4},8);
        System.out.println(position[0]);
        System.out.println(position[1]);
    }

    public static int[] twoSum(int[] arr, int target){
        int[] num= new int[2];

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    num[0]=i;
                    num[1]=j;
                }
            }
        }
        return num;
    }
}
