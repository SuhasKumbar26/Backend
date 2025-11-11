package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TerminalOperations {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 1, 4, 10, 7);
        // 1. forEach
        numbers.stream()
                .filter((Integer val ) -> val >= 3)
                .forEach(System.out::println);
        System.out.println();

        // 2. toArray
        List<Integer> number1 = List.of(2, 1, 4, 10, 7);
        Object[] arr = number1.stream()
                .filter((Integer v) -> v >= 3)
                .toArray();
        System.out.println(Arrays.toString(arr));
        System.out.println();

        // 3. reduce
        List<Integer> numbers2 = List.of(2, 1, 4, 10, 7);
        Optional<Integer> reducedVal = numbers2.stream()
                .reduce((Integer v1, Integer v2)-> v1+v2);
        System.out.println("Reduced: "+reducedVal.get());
        System.out.println();

        // 4. collect
        List<Integer> numbers3 = List.of(2, 1, 4, 10, 7);
        List<Integer> numList = numbers3.stream()
                .filter((Integer val) -> val >= 3)
                .toList();
        System.out.println(numList);
        System.out.println();

        // 5. min gives first element, and max gives last value
        List<Integer> numbers4 = List.of(2, 1, 4, 10, 7);
        Optional<Integer> minVal1 = numbers4.stream()
                .filter((Integer val) -> val >= 3)
                .min((Integer v1, Integer v2) -> v1-v2);
        System.out.println("MinVal1: "+minVal1.get());
        System.out.println();

        List<Integer> numbers5 = List.of(2, 1, 4, 10, 7);
        Optional<Integer> minVal2 = numbers5.stream()
                .filter((Integer val) -> val >= 3)
                .min((Integer v1, Integer v2) -> v2-v1);
        System.out.println("MinVal2: "+minVal2.get());
        System.out.println();

        List<Integer> numbers6 = List.of(2, 1, 4, 10, 7);
        Optional<Integer> maxVal = numbers6.stream()
                .filter((Integer val) -> val >= 3)
                .max((Integer v1, Integer v2) -> v1-v2);
        System.out.println("MaxVal1: "+ maxVal.get());
        System.out.println();

        List<Integer> numbers7 = List.of(2, 1, 4, 10, 7);
        Optional<Integer> maxVal2 = numbers7.stream()
                .filter((Integer val) -> val >= 3)
                .max((Integer v1, Integer v2) -> v2-v1);
        System.out.println("MaxVal2: "+ maxVal2.get());
        System.out.println();

        // 6. count
        List<Integer> numbers8 = List.of(2, 1, 4, 10, 7);
        long count = numbers8.stream()
                .filter((Integer val) -> val >= 3)
                .count();
        System.out.println("Count: "+count);
        System.out.println();

        // 7. anyMatch
        List<Integer> numbers9 = List.of(2, 1, 4, 10, 7);
        boolean anyMatch = numbers9.stream()
                .anyMatch((Integer val) -> val >= 3);
        System.out.println("Any Match: "+anyMatch);
        System.out.println();

        // 8. allMatch
        List<Integer> numbers10 = List.of(2, 1, 4, 10, 7);
        boolean allMatch = numbers10.stream()
                .anyMatch((Integer val) -> val >= 3);
        System.out.println("All Match: "+ allMatch);
        System.out.println();

        // 9. noneMatch
        List<Integer> numbers11 = List.of(2, 1, 4, 10, 7);
        boolean noneMatch = numbers11.stream()
                .noneMatch((Integer val) -> val >= 3);
        System.out.println("none Match: "+ noneMatch);
        System.out.println();

        // 10. findFirst
        List<Integer> numbers12 = List.of(2, 1, 4, 10, 7);
        Optional<Integer> findFirst = numbers12.stream()
                .filter((Integer val) -> val >= 3)
                .findFirst();
        System.out.println("find First: "+ findFirst.get());
        System.out.println();


    }
}
