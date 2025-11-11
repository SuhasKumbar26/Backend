package _04Locks.ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {
    boolean isAvailable = false;

    public void produce(ReentrantLock lock){
        try {
            lock.lock();
            System.out.println("Producer Lock Acquired by: "+Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(4000);
        } catch (InterruptedException e){
            System.out.println("Error");
        } finally {
            System.out.println("Producer Lock Released by: "+Thread.currentThread().getName());
            lock.unlock();
        }
    }

    public void consumer(ReentrantLock lock){
        try {
            lock.lock();
            System.out.println("Consumer Lock Acquired by: "+Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(4000);
        } catch (InterruptedException e){
            System.out.println("Error");
        } finally {
            System.out.println("Consumer Lock Released by: "+Thread.currentThread().getName());
            lock.unlock();
        }
    }
}
