package _01ThreadCreation;

public class DemoClass extends Thread{
    @Override
    public void run(){
        System.out.println("Thread name: "+Thread.currentThread().getName());
    }
}
