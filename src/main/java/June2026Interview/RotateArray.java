package June2026Interview;

import java.util.ArrayList;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i=arr.length-1;i>=0;i--){
            arrayList.add(arr[i]);
        }

        arrayList.forEach(s -> System.out.print(s+","));
    }
}
