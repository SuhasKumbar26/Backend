package _06LockFreeConcurrency;

public class SharedResource {
    private int counter;

    public synchronized void increment(){
        counter++;
    }

    public int getCounter(){
        return counter;
    }
}
