package _04Locks.ReadWriteLock;

import java.util.concurrent.locks.ReadWriteLock;

public class SharedResource {
    boolean isAvailable = false;

    public void reading(ReadWriteLock lock){ // reading
        try{
            lock.readLock().lock();
            isAvailable = true;
            System.out.println("Read lock is Acquired by: "+Thread.currentThread().getName());
            Thread.sleep(5000);
        }catch (InterruptedException e){
            System.out.println("Error");
        }finally {
            lock.readLock().unlock();
            System.out.println("Read lock is Released by: "+Thread.currentThread().getName());
        }
    }

    public void writing(ReadWriteLock lock){ // reading
        try{
            lock.writeLock().lock();
            isAvailable = true;
            System.out.println("Write lock is Acquired by: "+Thread.currentThread().getName());
            Thread.sleep(5000);
        }catch (InterruptedException e){
            System.out.println("Error");
        }finally {
            lock.writeLock().unlock();
            System.out.println("Write lock is Released by: "+Thread.currentThread().getName());
        }
    }
}
