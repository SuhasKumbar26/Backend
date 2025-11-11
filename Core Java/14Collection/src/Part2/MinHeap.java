package Part2;

import java.util.PriorityQueue;

public class MinHeap {
    public static void main(String[] args) {
        // by default MinHeap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        /*String var = String.valueOf(minHeap.peek());
        System.out.println(var);*/
        minHeap.add(5);
        minHeap.add(3);
        minHeap.add(8);
        minHeap.add(2);

        System.out.println(minHeap);

        minHeap.forEach((Integer val) -> System.out.print(val+" "));
        System.out.println();

        while (!minHeap.isEmpty()){
            int val = minHeap.peek();
            System.out.println(val+" ");
            minHeap.poll();
        }

    }
}
