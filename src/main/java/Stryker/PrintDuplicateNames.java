package Stryker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class PrintDuplicateNames {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "John",
                "Mike",
                "John",
                "David",
                "Mike",
                "Alex"
        );

        HashSet<String> set = new HashSet<>();
        ArrayList<String> arrayList = new ArrayList<>();

        for(String name : names){
            if(!set.add(name)){
                arrayList.add(name);
            }
        }

        for(String val : arrayList){
            System.out.println("Duplicate values are="+ val);
        }
    }
}
