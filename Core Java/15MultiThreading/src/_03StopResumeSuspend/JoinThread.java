package _03StopResumeSuspend;

public class JoinThread {
    public static void main(String[] args) {
        Resource resource = new Resource();

        System.out.println("main thread is Started");

        Thread th1 = new Thread( () -> {
            System.out.println("Thread-0 is calling produce method");
            resource.produce();
        });

//        th1.setDaemon(true);
//        // only alive till anyOne User Thread is Alive
        th1.start();

//        try {
//            th1.join();
//        } catch (Exception e){
//            System.out.println("Can't wait error happened");
//        }

        /*
        th1.setPriority(7);
        th1.setPriority(Thread.MIN_PRIORITY); // 1
        th1.setPriority(Thread.MAX_PRIORITY); // 10
        th1.setPriority(Thread.NORM_PRIORITY); // 5
        */


        System.out.println("ReadWriteExample thread is Executed his Work");
    }
}
