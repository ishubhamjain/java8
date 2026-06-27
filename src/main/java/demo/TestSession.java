package demo;

import java.util.*;

public class TestSession {
    public static void main(String[] args) {
        int[] arr = {1,2,5,4,5,6,3,2,5,4,1,2,5,4,1,2,5,6,3,2,5,4,1,2,5,6,3};

        HashMap<Integer,Integer> map= new HashMap<>();
        ArrayList<Integer> intarr = new ArrayList<>();

        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(int val:map.keySet()){
            System.out.println(val+" : "+map.get(val));
            intarr.add(map.get(val));
        }

        System.out.println("second question of sort");
//        for(int val : intarr){
//            System.out.println(val);
//        }

        // Convert map entries to a list
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

// Sort by value (ascending)
        Collections.sort(list, Comparator.comparing(Map.Entry::getValue));

// Reverse the list
        Collections.reverse(list);

// Store into LinkedHashMap to preserve order
        LinkedHashMap<Integer, Integer> sortedMap = new LinkedHashMap<>();

        for (Map.Entry<Integer, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

// Print
        for (Map.Entry<Integer, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


//        Collections.reverse(intarr2)
//
//        Collections.sort(intarr);
//      //  Collections.reverse(intarr,);
//        System.out.println("sorted list below:");
//        for(int val : intarr){
//            System.out.println(val);
//        }
//
//        for(int i=intarr.size()-1;i>=0;i--){
//            System.out.println(intarr.get(i));
//        }
//
//        System.out.println("reverse of occurance");
//        List<Integer> intarr2 =intarr.reversed();
//        for(int val : intarr2){
//            System.out.println(val);
//        }
//        System.out.println("reverse of occurance key value");
//
//        ///
////        //need result in {5:7,2:6,4:4...}
//        List<Map.Entry<Integer, Integer>> sortedList =
//                map.entrySet()
//                        .stream()
//                        .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
//                        .toList();
//
//        System.out.println(sortedList);
//
//        System.out.println("another key value pair");
//
//        LinkedHashMap<Integer, Integer> sortedMap = new LinkedHashMap<>();
//
//        for (Integer count : intarr) {
//            for (Integer key : map.keySet()) {
//                if (map.get(key).equals(count) && !sortedMap.containsKey(key)) {
//                    sortedMap.put(key, count);
//                }
//            }
//        }
//
//        System.out.println("this is");
//        for(int val : sortedMap.keySet()){
//            System.out.println(val+":"+sortedMap.get(val));
//        }

        ///

        System.out.println("2nd highest");
        int[] second = {1,2,3,5,4,5,6,8,5,7,5,9};
        Arrays.sort(second);
        System.out.println(second[second.length-2]);

    }
}
