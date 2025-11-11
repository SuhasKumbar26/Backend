package _02ThreadLifeCycle;

public class MonitorLockRunnable implements Runnable{

    MonitorClass obj;

    MonitorLockRunnable(MonitorClass obj){
        this.obj = obj;
    }

    @Override
    public void run() {
        obj.task1();
    }
}
