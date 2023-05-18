package Task1_id9219;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;

    public MyGenericStack() {
        stack = new LinkedList();
    }

    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {
        return stack.size() == 0;
    }

    public void push(T e) {
        stack.addFirst(e);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            return stack.removeFirst();
        }
    }

    @Override
    public String toString() {
        String str = "[";
        for (int i = size() - 1; i >= 0; i--) {
            if (i == size() - 1) {
                str += stack.get(i);
            } else {
                str += ", " + stack.get(i);
            }
        }
        str += "]";
        return str;
    }
}
