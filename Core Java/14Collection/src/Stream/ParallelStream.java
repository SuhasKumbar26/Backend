package Stream;

import java.util.List;

public class ParallelStream {
    public static void main(String[] args) {
        // sequential Processing
        List<Integer> list = List.of(12, 45, 59, 87, 75, 12, 36, 15, 99, 110,789, 456);
        long sequentialTime = System.currentTimeMillis();
        list.stream()
                .map((Integer val) -> val * val)
                .forEach((Integer val) -> System.out.print(val+" "));
        System.out.println("\nSequential time: "+(System.currentTimeMillis() - sequentialTime));

        // parallel Processing
        List<Integer> list1 = List.of(12, 45, 59, 87, 75, 12, 36, 15, 99, 110,789, 456);
        long sequentialTime1 = System.currentTimeMillis();
        list1.parallelStream()
                .map((Integer val) -> val * val)
                .forEach((Integer val) -> System.out.print(val+" "));
        System.out.println("\nParallel time: "+(System.currentTimeMillis() - sequentialTime1));

    }
}
