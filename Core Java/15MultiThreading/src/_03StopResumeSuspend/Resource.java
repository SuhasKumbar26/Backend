package _03StopResumeSuspend;

public class Resource {
    boolean isAvailable = false;

    public synchronized void produce(){
        System.out.println("Lock is Acquired by "+ Thread.currentThread().getName());
        isAvailable = true;
        try {
            Thread.sleep(8000);
        } catch (Exception e){
            System.out.println("Error");
        }
        System.out.println("Lock is released by "+Thread.currentThread().getName());
    }
}
