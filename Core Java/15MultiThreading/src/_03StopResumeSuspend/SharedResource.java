package _03StopResumeSuspend;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {
    private Queue<Integer> sharedBuffer;
    private int bufferSize;

    SharedResource(int bufferSize){
        sharedBuffer = new LinkedList<>();
        this.bufferSize = bufferSize;
    }

    public synchronized void produce(int item) throws InterruptedException {
        while (sharedBuffer.size() == bufferSize){
            System.out.println("Buffer is full, Producer is waiting for consumer");
            wait();
        }
        sharedBuffer.add(item);
        System.out.println("Produced: "+item);
        notify();
    }

    public synchronized int consumer() throws InterruptedException {
        while (sharedBuffer.isEmpty()){
            System.out.println("Buffer is empty, Consumer is waiting for Producer");
            wait();
        }
        int item = sharedBuffer.poll();
        System.out.println("Consumed: "+item);
        notify();
        return item;
    }
}
