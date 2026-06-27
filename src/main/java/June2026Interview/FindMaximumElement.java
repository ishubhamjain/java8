package June2026Interview;

public class FindMaximumElement {
    public static void main(String[] args) {
        int[] arr = {10,50,20,90};

        int max=0;
        for(int val : arr){
            if(val>max){
                max=val;
            }
        }
        System.out.println(max);

    }
}
