package _06LockFreeConcurrency;

public class SharedResourceExample {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Thread th1 = new Thread(() -> {
            for (int i = 0; i < 400; i++) {
                sharedResource.increment();
            }
        });

        Thread th2 = new Thread(() -> {
            for (int i = 0; i < 400; i++) {
                sharedResource.increment();
            }
        });

        th1.start();
        th2.start();

        try{
            th1.join();
            th2.join();
        }catch (InterruptedException e){
            System.out.println("Error");
        }

        System.out.println("Counter: "+sharedResource.getCounter());
    }
}
