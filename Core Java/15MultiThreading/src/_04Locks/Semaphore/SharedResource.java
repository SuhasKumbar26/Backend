package _04Locks.Semaphore;

import java.util.concurrent.Semaphore;

public class SharedResource {
    private boolean isAvailable = false;
    private final Semaphore locks = new Semaphore(2);

    public void producer(){
        try{
            locks.acquire();
            System.out.println("Producer Lock is Acquired by: "+Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(5000);
        } catch (InterruptedException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Producer Lock is Released by: "+Thread.currentThread().getName());
            locks.release();
        }
    }

    public void consumer(){
        try{
            locks.acquire();
            System.out.println("Consumer Lock is Acquired by: "+Thread.currentThread().getName());
            isAvailable = false;
        } catch (InterruptedException e){
            System.out.println(e.getMessage());
        }finally {
            locks.release();
            System.out.println("Consumer Lock is Released by: "+Thread.currentThread().getName());
        }
    }
}
