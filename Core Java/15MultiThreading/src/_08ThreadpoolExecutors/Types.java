package _08ThreadpoolExecutors;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Types {
    static void main() {
        ExecutorService fixedPool = Executors.newFixedThreadPool(3);

        fixedPool.submit(()-> {
            System.out.println("Fixed thread pool");
        });

        ExecutorService cachedPool = Executors.newCachedThreadPool();
        Future<String> future = cachedPool.submit(() -> {
            String str = "Hello java";
            System.out.println(str+"..................");
            return str;
        });

        ExecutorService singlePool = Executors.newSingleThreadExecutor();
        int a = 10;
        singlePool.submit(()->{
            System.out.println("JAVA forever");
        });

        try {
            System.out.println(future.get());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            fixedPool.shutdown();
            cachedPool.shutdown();
            singlePool.shutdown();
        }
    }
}
