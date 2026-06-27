package Java2026.Interview.practice;

public class TwoSums {

    public static void main(String[] args) {
        int[] i = twoSum(new int[]{1,2,3,5},4);
        System.out.println("array index 1 ="+i[0]+" ");
        System.out.println("array index 2 = "+i[1]+" ");
        System.out.println("index sum ="+i[0]+i[1]);
    }

    public static int[] twoSum(int[] nums, int target){
        int[] ans = new int[2];
        for(int i=0;i<=nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                }
            }
        }
        return ans;
    }
}
