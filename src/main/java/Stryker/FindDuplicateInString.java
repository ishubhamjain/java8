package Stryker;

import java.util.ArrayList;
import java.util.HashSet;


public class FindDuplicateInString {
    public static void main(String[] args) {
        String str = "programming";

        HashSet<Character> newStr = new HashSet<>();
        ArrayList<Character> newstrlist = new ArrayList<>();
        for(char val : str.toCharArray()){
            if(!newStr.add(val))
                newstrlist.add(val);
        }

        for(char val : newstrlist){
            System.out.print(val);
        }
        System.out.println();
        System.out.println("without collection");

        for(int i=0;i<=str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    System.out.print(str.charAt(i));
                }
            }
        }

        System.out.println("duplicate in array");
        int[] arr = {0,2,4,6,3,6,8};

        for(int i=0;i<=arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[i]);
                }
            }
        }
    }
}
