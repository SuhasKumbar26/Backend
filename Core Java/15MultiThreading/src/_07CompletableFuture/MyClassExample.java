package _07CompletableFuture;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class MyClassExample {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                1, 2, 1,
                TimeUnit.HOURS,
                new ArrayBlockingQueue<>(2),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );



        // 2. Runnable, T result
        List<Integer> output = new ArrayList<>();
        Future<List<Integer>> listFuture = executor.submit(new MyClass(output), output);

        try {
            // 1 Way
            listFuture.get();
            System.out.println(output.get(0));

            // 2nd way
            List<Integer> result = listFuture.get();
            System.out.println(result.getFirst());

        }catch (Exception e){
            //
        }

        // Callable
        Future<List<Integer>> future = executor.submit(() -> {
            System.out.println("Task 3 with callable");
            List<Integer> list = new ArrayList<>();
            list.add(123);
            return list;
        });

        try {
            List<Integer> result = future.get();
            System.out.println(result.getFirst());
        }catch (Exception e){
            System.out.println("Error");
        }
        
        executor.shutdown();
    }
}
