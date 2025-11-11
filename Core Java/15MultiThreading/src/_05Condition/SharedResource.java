package _05Condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {
    private boolean isAvailable = true;
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void producer(){
        try{
            lock.lock();
            System.out.println("Producer lock is acquired by: "+Thread.currentThread().getName());
            if (isAvailable){
                System.out.println("Producer is on waiting for CONSUMER: "+Thread.currentThread().getName());
                condition.await();
            }
            isAvailable = true;
            condition.signalAll();

        }catch (InterruptedException e){
            System.out.println("Error");
        } finally {
            System.out.println("Producer lock is released by: "+Thread.currentThread().getName());
            lock.unlock();
        }
    }

    public void consumer(){
        try{
            lock.lock();
            System.out.println("consumer lock is acquired by: "+Thread.currentThread().getName());
            if(!isAvailable){
                System.out.println("consumer is on waiting for PRODUCER: "+Thread.currentThread().getName());
                condition.await();
            }
            isAvailable = false;
            condition.signalAll();
        }catch (InterruptedException e){
            System.out.println("Error");
        } finally {
            lock.unlock();
            System.out.println("consumer lock is released by: "+Thread.currentThread().getName());
        }
    }
}
