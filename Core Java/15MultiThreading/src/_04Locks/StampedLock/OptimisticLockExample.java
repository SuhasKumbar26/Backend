package _04Locks.StampedLock;

public class OptimisticLockExample {
    public static void main(String[] args) {
        SharedResourceOptimistic resourceOptimistic = new SharedResourceOptimistic();

        Thread th1 = new Thread( () -> {
            System.out.println(Thread.currentThread().getName()+": is trying to update1(111)");
            resourceOptimistic.updater1();
        });

        Thread th2 = new Thread( () -> {
            System.out.println(Thread.currentThread().getName()+": is trying to update2(222)");
            resourceOptimistic.updater2();
        });

        th1.start();
        th2.start();
    }
}
