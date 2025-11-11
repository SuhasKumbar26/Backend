package _01ThreadCreation;

public class MyClass implements Runnable{
    @Override
    public void run(){
        System.out.println("Thread name: "+Thread.currentThread().getName());
    }
}
