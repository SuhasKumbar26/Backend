package _01ThreadCreation;

public class threadCreation {
    public static void main(String[] args) {
        System.out.println("Thread name: "+Thread.currentThread().getName());
        MyClass myClassObj = new MyClass();
        Thread thread = new Thread(myClassObj);
        thread.start();

        System.out.println("Execution ended");
    }
}
