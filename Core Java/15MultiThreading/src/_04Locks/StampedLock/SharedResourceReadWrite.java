package _04Locks.StampedLock;

import java.util.concurrent.locks.StampedLock;

public class SharedResourceReadWrite {
    private int a = 10;
    private boolean isAvailable = false;
    private final StampedLock lock = new StampedLock();

    public void reading(){
        long stamp = lock.readLock();
        try{
            isAvailable = true;
            System.out.println("Read lock is Acquired by: "+Thread.currentThread().getName());
            Thread.sleep(5000);
        }catch (InterruptedException e){
            System.out.println("Error");
        }finally {
            lock.unlockRead(stamp);
            System.out.println("Read lock is Released by: "+Thread.currentThread().getName());
        }
    }

    public void writing(){
        long stamp = lock.writeLock();
        try{
            isAvailable = true;
            System.out.println("Write lock is Acquired by: "+Thread.currentThread().getName());
            Thread.sleep(5000);
        }catch (InterruptedException e){
            System.out.println("Error");
        }finally {
            lock.unlockWrite(stamp);
            System.out.println("Write lock is Released by: "+Thread.currentThread().getName());
        }
    }
}
