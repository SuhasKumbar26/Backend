package Part3;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(123);
        stack.addLast(890);
        stack.pop();

        System.out.println(stack);
    }
}
