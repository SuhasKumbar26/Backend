package _07CompletableFuture;

import java.util.concurrent.*;

public class CompletableFutureExample {
    static void main() {
        ThreadPoolExecutor executor = null;
        try {
             executor = new ThreadPoolExecutor(2, 3,
                    1, TimeUnit.HOURS, new ArrayBlockingQueue<>(2),
                    Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy()
            );

            CompletableFuture<String> asyncTask1 = CompletableFuture.supplyAsync(() -> {
                return "Task is completed";
            }, executor);
            System.out.println(asyncTask1.get());

            // ----------------------------------------------------------------------------

            CompletableFuture<String> asyncTask2 = CompletableFuture.supplyAsync(
                    () -> {
                        return "I'm learning Java";
            },executor).thenApply((String val) -> {
                return val + " Nicely";
            });
            System.out.println(asyncTask2.get());

            // ----------------------------------------------------------------------------

            CompletableFuture<String> asyncTask3 = CompletableFuture.supplyAsync(() ->{
                System.out.println("ThreadName: "+Thread.currentThread().getName());
                return "Let's dance";
            },executor).thenApply((String val) -> {
                System.out.println("ThreadName: "+Thread.currentThread().getName());
                return val + " together";
            }).thenApplyAsync((String val) ->{
                System.out.println("ThreadName: "+Thread.currentThread().getName());
                return val +" now";
            },executor);

            System.out.println(asyncTask3.get());

        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            assert executor != null;
            executor.shutdown();
        }
    }
}
