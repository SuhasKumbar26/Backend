package _06LockFreeConcurrency;

import java.util.concurrent.*;

public class ThreadPoolExample {
    public static void main(String[] args) {

        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                2,4,1,
                TimeUnit.MINUTES,
                new ArrayBlockingQueue<>(2),
                new customThreadFactory(),
                new customRejectHandler()
        );

        executor.allowCoreThreadTimeOut(true);

        for(int i=0; i<5; i++){

            int finalI = i;
            executor.submit( () ->{
                try{
                    Thread.sleep(3000);
                }catch (Exception e){
                    System.out.println();
                }
                System.out.println(finalI +"th task processed by: "+Thread.currentThread().getName());
            });
        }

        executor.shutdown();
    }
}



