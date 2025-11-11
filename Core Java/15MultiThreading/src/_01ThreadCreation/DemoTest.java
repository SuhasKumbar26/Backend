package _01ThreadCreation;

public class DemoTest {
    public static void main(String[] args)  {
        System.out.println("Thread name: "+Thread.currentThread().getName());
        DemoClass thread = new DemoClass();
        thread.start();
        System.out.println("Execution ended");
    }
}
