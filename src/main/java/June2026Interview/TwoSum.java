package June2026Interview;

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        int target = 9;
        System.out.println(twoSum(arr,target)[0]+" "+twoSum(arr,target)[1]);
    }

    public static int[] twoSum(int[] arr, int target){
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
