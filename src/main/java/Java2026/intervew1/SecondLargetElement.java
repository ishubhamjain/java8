package Java2026.intervew1;

public class SecondLargetElement {
    public static void main(String[] args) {
        int largest = 0;
        int second = 0;
        int[] arr = {10, 5, 20, 8, 11,20};

        for(int num:arr){
            if(num>largest){
                second = largest;
                largest = num;
            }else if (num > second && num != largest) {
                second = num;
            }
        }
        System.out.println(second);
    }
}
