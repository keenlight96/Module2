package Task1_id9210;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void ensureCapa() {
        int newLength = elements.length * 2;
        elements = Arrays.copyOf(elements, newLength);
    }

    public void add(E element) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = element;
    }

    public E get(int index) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Index= " + index + ". Size = " + size);
        }
        return (E) elements[index];
    }


}
