package _05Condition;

public class Main {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread th1 = new Thread( () -> {
            System.out.println(Thread.currentThread().getName()+" :is running");
            resource.producer();
        });

        Thread th2 = new Thread( () -> {
            System.out.println(Thread.currentThread().getName()+" :is running");
            resource.consumer();
        });

        th1.start();
        th2.start();
    }
}
