package _02ThreadLifeCycle.SharedResource;

public class SharedResource {
    boolean isItemAvailable = false;

    public synchronized void addItem(){
        isItemAvailable = true;
        System.out.println("Item is added "+Thread.currentThread().getName()+" and invoke all the threads are waiting");
        notifyAll(); // All monitor locks are released
    }

    public synchronized void consumeItem(){
        System.out.println("ConsumeItem is invoked by: "+Thread.currentThread().getName());
        while (!isItemAvailable){
            try{
                System.out.println("Thread "+Thread.currentThread().getName()+" is waiting now");
                wait(); // all MONITOR locks are released
            } catch (Exception e){
                System.out.println("Error");
            }
        }
        System.out.println("Item is consumed by: "+Thread.currentThread().getName());
        isItemAvailable = false;
    }
}
