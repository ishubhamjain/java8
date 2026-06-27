package LeetCode;

//https://www.youtube.com/watch?v=6zfMQVfQOds&list=PLs-JnCrPsdJExy8nJZOP2AoVnvhf2SCKH&index=1
public class QuestionTwoSum {
    public static void main(String[] args) {
        int i[] =  twoSum(new int[]{1, 2, 3,5,6}, 4);
        System.out.print(i[0]+",");
        System.out.println(i[1]);
    }
    public static  int[] twoSum(int[] nums, int target) {

        int[] ans = new int[2];

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }
}
