package Java2026.intervew1;

public class SumOfTwo {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 13;
        int[] position = number(arr,target);
        System.out.println(position[0]+" "+position[1]);
    }

    public static int[] number(int[] arr, int target){
        int[] num = new int[2];
        for(int i=0;i<=arr.length;i++){
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
