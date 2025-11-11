package Part3;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(215);
        list.addLast(125);

        list.add(1,1000);
        list.set(0,1);
        System.out.println(list);
    }
}
