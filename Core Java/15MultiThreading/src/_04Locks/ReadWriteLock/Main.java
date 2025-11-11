package _04Locks.ReadWriteLock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        ReadWriteLock lock = new ReentrantReadWriteLock();

        Thread th1 = new Thread( () -> {
            System.out.println(Thread.currentThread().getName()+" :is trying to Lock");
            resource.reading(lock);
        });

        SharedResource resource1 = new SharedResource();
        Thread th2 = new Thread( () -> {
            System.out.println(Thread.currentThread().getName()+" :is trying to Lock");
            resource1.writing(lock);
        });

        th1.start();
        th2.start();
    }
}
