package _08ThreadpoolExecutors;

import java.util.concurrent.*;

public class WorkStealingPool {
    static void main() {
        ForkJoinPool wrkStPool1 = (ForkJoinPool) Executors.newWorkStealingPool();
        ExecutorService wrkStPool =  Executors.newWorkStealingPool();

        Future<Integer> future = wrkStPool.submit(() -> new ComputeTask(1,100).invoke());
        Future<Integer> future1 = wrkStPool1.submit(new ComputeTask(1,100));

        try{
            System.out.println(future.get());
            System.out.println(future1.get());
        } catch (Exception e) {
            System.out.println();
        }
    }
}
