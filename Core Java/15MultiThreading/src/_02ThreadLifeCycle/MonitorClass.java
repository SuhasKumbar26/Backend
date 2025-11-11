package _02ThreadLifeCycle;

public class MonitorClass {

     public synchronized void task1(){
        try {
            System.out.println("Inside task1");
            Thread.sleep(10000);
        } catch (InterruptedException e){
            System.out.println("Exception occurred");
        }
    }

    public void task2(){
        System.out.println("task2, but before synchronized");
        synchronized (this) {
            System.out.println("task2, inside synchronized");
        }
    }

    public void task3(){
        System.out.println("task3");
    }
}
