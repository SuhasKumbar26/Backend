package Part1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Methods {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        System.out.println("Size: "+list.size());
        System.out.println("isEmpty: "+list.isEmpty());
        System.out.println("contains: "+list.contains(4));
        System.out.println("Add: "+list.add(100));
        System.out.println(list);
        System.out.println("remove: "+list.remove(2)); // at index
        System.out.println("remove value: "+list.remove(Integer.valueOf(100))); // at index
        System.out.println(list);

        Stack<Integer> stack = new Stack<>();
        stack.add(11);
        stack.add(22);
        stack.add(33);
        stack.add(44);

        list.addAll(stack);

        System.out.println(list);
        System.out.println("containsAll: "+list.containsAll(stack));

        list.removeAll(stack);
        System.out.println(list);
        System.out.println("Clear: ");
        list.clear();
        System.out.println(list);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(4);
        list1.add(2);
        list1.add(5);
        list1.add(3);
        System.out.println(list1);
        System.out.println(list1.get(2));

        Collections.sort(list1);
        System.out.println(list1);
        System.out.println("Max: "+Collections.max(list1));
        System.out.println("Max: "+Collections.min(list1));
        Collections.swap(list1,3,1);
        System.out.println(list1);
        Collections.rotate(list1,3);
        System.out.println(list1);

    }
}
