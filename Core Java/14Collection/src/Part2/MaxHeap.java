package Part2;

import java.util.PriorityQueue;

public class MaxHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((Integer a, Integer b) -> b-a);
        maxHeap.add(5);
        maxHeap.add(3);
        maxHeap.add(8);
        maxHeap.add(2);

        System.out.println(maxHeap);
        System.out.println();
        maxHeap.forEach((Integer val) -> System.out.print(val+" "));

        while (!maxHeap.isEmpty()){
            System.out.print(maxHeap.remove()+" ");
        }
    }
}
