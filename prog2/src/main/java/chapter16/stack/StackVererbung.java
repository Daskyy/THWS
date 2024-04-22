package chapter16.stack;

import java.util.ArrayList;

public class StackVererbung extends ArrayList<Integer> implements StackInterface {
    public boolean isEmpty() {
        return size() == 0;
    }

    public void push(int i) {
        add(i);
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack leer");
        }
        return remove(size() - 1);
    }

    // Nachteile der Vererbung:
    // Kopplung: StackVererbung ist an ArrayList gebunden, Änderungen an ArrayList können StackVererbung beeinflussen
    // StackVererbung kann nicht von einer anderen Klasse erben

}
