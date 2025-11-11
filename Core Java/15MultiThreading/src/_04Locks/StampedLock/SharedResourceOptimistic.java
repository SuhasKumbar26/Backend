package _04Locks.StampedLock;

import java.util.concurrent.locks.StampedLock;

public class SharedResourceOptimistic {
    private int source = 10;
    StampedLock lock = new StampedLock();

    public void updater1(){
        long stamp = lock.tryOptimisticRead();
        try {
            System.out.println(Thread.currentThread().getName()+": is taken optimistic read");
            source = 111;
            Thread.sleep(5000);

            if(lock.validate(stamp)){
                System.out.println(Thread.currentThread().getName()+": is updated Value successfully(111)");
            } else{
                System.out.println(Thread.currentThread().getName()+": RollBacked");
                source = 10;
            }
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }

    public void updater2(){
        long stamp = lock.writeLock();
        try {
            System.out.println(Thread.currentThread().getName()+": is taken write lock");
            source = 222;
            System.out.println(Thread.currentThread().getName()+": Updated successfully(222)");
        } finally {
            lock.unlockWrite(stamp);
            System.out.println(Thread.currentThread().getName()+": is released write lock");
        }
    }
}
