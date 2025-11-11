package _02ThreadLifeCycle;

public class testMonitor {
    public static void main(String[] args) {
        MonitorClass Obj = new MonitorClass();
        MonitorLockRunnable monitorLockRunnable = new MonitorLockRunnable(Obj);

        Thread t1 = new Thread(monitorLockRunnable);

        Thread t2 = new Thread(() -> {
            Obj.task2();
        });
        Thread t3 = new Thread(Obj::task3);

        t1.start();
        t2.start();
        t3.start();
    }
}
