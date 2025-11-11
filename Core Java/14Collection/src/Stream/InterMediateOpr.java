package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InterMediateOpr {
    public static void main(String[] args) {
        // 1. Filter
        Stream<String> nameStream = Stream.of("I", "Love", "Java", "MORE", "Than", "ANY","Language");
        Stream<String> filteredStream = nameStream.filter((String s) -> s.length()>3);
        List<String> nameList = filteredStream.toList();
        System.out.println(nameList);

        // 2. map
        Stream<String> nameStream1 = Stream.of("I", "Love", "Java", "MORE", "Than", "ANY","Language");
        nameStream1.map(String::toLowerCase)
                .forEach((String s)-> System.out.print(s+" "));

        // 3. FlatMap
        List<List<String>> sentenceList = Arrays.asList(
                Arrays.asList("I", "Love", "Java"),
                Arrays.asList("MORE", "Than"),
                Arrays.asList("ANY","Language")
        );

        System.out.println();
        sentenceList.stream()
                .flatMap((List<String> sentence) -> sentence.stream())
                .forEach(System.out::print);

//        sentenceList.stream()
//                .flatMap((List<String> sentence) -> sentence.stream().map((String s) -> s.toLowerCase()));

        // 4. distinct
        Integer[] arr = {58, 23, 68, 58, 24, 58, 24, 58};
        Stream<Integer> integerStream = Arrays.stream(arr).distinct();
        System.out.println();
        integerStream.forEach((Integer i) -> System.out.printf("%d ",i));
        System.out.println();

        // 5. sorted
        List<Integer> numList = List.of(58, 23, 68, 58, 24, 58, 24, 58);
        numList.stream().sorted().forEach(i -> System.out.printf("%d ",i));
//        numList.stream().sorted((Integer v1, Integer v2) -> v2 - v1).forEach(i -> System.out.printf("%d ",i));
        System.out.println();

        // 6. peek -> helps you to see in intermediate elements in the stream
        Stream<Integer> intStream = Stream.of(56,48,967,52,41,63,59,68,43,12);
        long count = intStream
                .filter((Integer val) -> val%2 == 0)
                .peek((Integer i) -> System.out.printf("%d ",i))
                .count();

        System.out.println("\ncount: "+count);

        // 7. limit
        Stream<Integer> integerStream1 = Stream.of(56,48,96,52,41,63,59,68,43,12);
        integerStream1.limit(5).forEach(i -> System.out.printf("%d ",i));
        System.out.println();

        // 8. Skip -> skip the first n elements of the stream
        Stream<Integer> integerStream2 = Stream.of(56,48,96,52,41,63,59,68,43,12);
        integerStream2.skip(5).forEach(i -> System.out.printf("%d ",i));
        System.out.println();

        // 9. mapToInt
        List<String> numberList = List.of("56","2","5","8","12","7");
        int[] intArr = numberList.stream().mapToInt(Integer::parseInt).toArray();

        for (int i : intArr) System.out.printf("%d ",i);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Actual Output");
        System.out.println("==============");

        /*
        Generally, Each element is processed Sequentially and can perform multiple operations
        this feature of stream is helps to fast process task
        */
        List<Integer> numbers = List.of(2, 1, 4, 10, 7);
        List<Integer> filteredInt = numbers.stream()
                .filter((Integer val) -> val >=3)
                .peek((Integer val) -> System.out.println("After filter: "+val))
                .map((Integer val) -> val*-1)
                .peek((Integer val) -> System.out.println("After negating: "+val))
                .sorted()
                .peek((Integer val) -> System.out.println("After sorting: "+val))
                .toList();

        // Expected output
        /*
         After filter: 4
         After filter: 10
         After filter: 7

         After negating: -4
         After negating: -10
         After negating: -7

         After sorting: -10
         After sorting: -7
         After sorting: -4
        */
    }
}
