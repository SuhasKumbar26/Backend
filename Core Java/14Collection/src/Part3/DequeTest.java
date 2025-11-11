package Part3;

import java.util.ArrayDeque;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.PriorityBlockingQueue;

public class DequeTest {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        // Insertion
        arrayDeque.addLast(12);
        arrayDeque.addFirst(99);

        arrayDeque.offerLast(21);
        arrayDeque.offerFirst(52);

        System.out.println(arrayDeque);

        // deletion
        arrayDeque.removeFirst();
        arrayDeque.removeLast();

        arrayDeque.pollFirst();
        arrayDeque.pollLast();

        System.out.println(arrayDeque);


        // PRIORITY QUEUE THREAD SAFE VERSION
        PriorityBlockingQueue<Integer> priorityBlockingQueue = new PriorityBlockingQueue<>();
        // insertion
        priorityBlockingQueue.add(12);
        priorityBlockingQueue.offer(21);

        System.out.println(priorityBlockingQueue);
        // deletion
        priorityBlockingQueue.remove();
        priorityBlockingQueue.poll();


        // CONCURRENT LINKED DEQUEUE THREAD SAFE VERSION
        ConcurrentLinkedDeque<Integer> concurrentLinkedDeque = new ConcurrentLinkedDeque<>();
        // INSERTION
        concurrentLinkedDeque.add(234);
        concurrentLinkedDeque.addLast(425);
        concurrentLinkedDeque.addFirst(568);

        concurrentLinkedDeque.offer(8);
        concurrentLinkedDeque.offerLast(8);
        concurrentLinkedDeque.offerFirst(8);

        System.out.println(concurrentLinkedDeque);

        // DELETION
        concurrentLinkedDeque.remove();
        concurrentLinkedDeque.removeFirst();
        concurrentLinkedDeque.removeLast();

        concurrentLinkedDeque.poll();
        concurrentLinkedDeque.pollLast();
        concurrentLinkedDeque.pollFirst();
    }
}
