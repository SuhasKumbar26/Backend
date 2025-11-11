package _04Locks.StampedLock;

public class ReadWriteExample {
    public static void main(String[] args) {
        SharedResourceReadWrite resource = new SharedResourceReadWrite();

        Thread th1 = new Thread( () -> {
            System.out.println(Thread.currentThread().getName()+" : th1 is trying to lock");
            resource.reading();
        });

        Thread th2 = new Thread( () -> {
            System.out.println(Thread.currentThread().getName()+" : th2 is trying to lock");
            resource.reading();
        });

        Thread th3 = new Thread( () -> {
            System.out.println(Thread.currentThread().getName()+" : th3 is trying to lock");
            resource.writing();
        });

        th1.start();
        th2.start();
        th3.start();
    }
}
