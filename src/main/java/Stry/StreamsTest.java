package Stry;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreamsTest {
    public static void main(String[] args) {
        List<Integer> numbers =
                Arrays.asList(1,2,3,4,5,6,7,8,9,10);


        numbers.stream()
                .filter(num -> num % 2 == 0)
                .forEach(System.out::println);

        Integer secondHighest =
                numbers.stream()
                        .distinct()
                        .sorted(Comparator.reverseOrder())
                        .skip(1)
                        .findFirst()
                        .orElse(null);

        System.out.println(secondHighest);


        Integer firstNonRepeating =
                numbers.stream()
                        .filter(num ->
                                Collections.frequency(numbers, num) == 1)
                        .findFirst()
                        .orElse(null);

        System.out.println(firstNonRepeating);
    }
}
