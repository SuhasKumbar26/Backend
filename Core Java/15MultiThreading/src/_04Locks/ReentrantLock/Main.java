package _04Locks.ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        ReentrantLock lock = new ReentrantLock();

        Thread th1 = new Thread( () -> {
            System.out.println(Thread.currentThread().getName()+" is Trying to Acquire lock");
            resource.produce(lock);
        });

        SharedResource resource1 = new SharedResource();
        Thread th2 = new Thread( () -> {
            System.out.println(Thread.currentThread().getName()+" is Trying to Acquire lock");
            resource1.consumer(lock);
        });

        th1.start();
        th2.start();
    }
}
