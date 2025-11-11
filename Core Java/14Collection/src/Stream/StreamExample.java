package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> salary = new ArrayList<>();
        salary.add(3053);
        salary.add(3000);
        salary.add(2053);
        salary.add(1053);
        salary.add(4053);
        salary.add(9053);

        long count = salary.stream()
                .filter((Integer val)-> val>=3000).count();
        System.out.println("Salary is >= 3000: "+count);

        // Different ways to create Stream
        // 1. From Collection
        List<Integer> list = Arrays.asList(23,14,28,45,20,19);
        Stream<Integer> integerStream = list.stream();
        integerStream.close();

        // 2. From Array
        Integer[] arr = {100,243,890,964,123};
        Stream<Integer> arrStream = Arrays.stream(arr);
        arrStream.close();

        // 3. From static method (of)
        Stream<Integer> staticStream = Stream.of(123,568,459,687,456);
        staticStream.close();

        // 4. Stream Builder
        Stream.Builder<Integer> streamBuilder = Stream.builder();
        streamBuilder.add(125).add(584).add(123);

        Stream<Integer> streamFromStreamBuilder = streamBuilder.build();
        streamFromStreamBuilder.close();

        // 5. Stream Iterator
        Stream<Integer> streamIterator = Stream.iterate(100,(Integer val) -> val + 50).limit(5);
        streamIterator.close();
    }
}
