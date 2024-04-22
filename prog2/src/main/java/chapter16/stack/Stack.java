package chapter16.stack;

import java.util.ArrayList;

public class Stack implements StackInterface {
    private ArrayList<Integer> stack = new ArrayList<>();

    public void push(int i) {
        stack.add(i);
    }

    public int pop() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("Stack leer");
        }
        return stack.remove(stack.size() - 1);
    }
}
