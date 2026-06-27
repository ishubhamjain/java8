package Java2026.intervew1;

import java.util.ArrayList;
import java.util.List;

public class DuplicateWithOutSet {

    static int[] arr = {2,2,2,2,4,56};

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();

        for(int a : arr){
            if(!arrayList.contains(a)){
                arrayList.add(a);
            }
        }

        for(int val: arrayList){
            System.out.println(val);
        }

    }
}

