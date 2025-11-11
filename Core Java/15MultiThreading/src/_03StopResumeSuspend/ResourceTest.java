package _03StopResumeSuspend;

public class ResourceTest {
    public static void main(String[] args) {
        Resource resourceObj =  new Resource();
        System.out.println("ReadWriteExample thread is Started");

        Thread th0 = new Thread(() -> {
            System.out.println("Thread-0 is calling produce method");
            resourceObj.produce();
        });

        Thread th1 = new Thread(() -> {
           try {
               Thread.sleep(1000);
           } catch (Exception e){
               System.out.println("Error");
           }
            System.out.println("Thread-1 is calling produce method");
           resourceObj.produce();
        });

        th0.start();
        th1.start();

        try {
            Thread.sleep(3000);
        } catch (Exception e){
            System.out.println("Error");
        }

        System.out.println("Thread-0 is suspended");
//        th0.suspend();
        System.out.println("ReadWriteExample thread is finishing his task");
//        th0.resume();
    }
}
