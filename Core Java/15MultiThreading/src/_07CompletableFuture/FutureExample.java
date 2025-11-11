package _07CompletableFuture;

import java.util.concurrent.*;

public class FutureExample {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                2, 3, 1,
                TimeUnit.HOURS,
                new ArrayBlockingQueue<>(2),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );

        Future<?> futureObj = executor.submit( () -> {
            try {
                Thread.sleep(5000);
                System.out.println("This is the task which thread will be executed");
            }catch (Exception e){
                //handle exception
            }
        });

        System.out.println("id Done: "+futureObj.isDone());
        try {
            futureObj.get(2,TimeUnit.SECONDS);
        }catch (TimeoutException e){
            System.out.println("Error");
        }catch (Exception e){
            //
        }
        try {
            futureObj.get();
        }catch (Exception e){
            //
        }

        System.out.println("is Done: "+futureObj.isDone());
        System.out.println("is Done: "+futureObj.isCancelled());

        // --------------------------------------------------------
        //Runnable
        Future<?> futureObj1 = executor.submit(() -> {
            System.out.println("Callable future");
        });

        // Callable
        Future<Integer> futureObj2 = executor.submit(() -> {
            System.out.println("Callable future");
            return 45;
        });

        try {
            futureObj2.get();
        }catch (Exception e){
            //
        }
        System.out.println(futureObj2.resultNow());

        executor.shutdown();


    }
}
