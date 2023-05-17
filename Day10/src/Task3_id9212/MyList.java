package Task3_id9212;

public class MyList<E> {
    int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void ensureCapacity() {
        if (size == elements.length) {
            Object[] newElements = new Object[elements.length * 2];
            for (int i = 0; i < elements.length; i++) {
                newElements[i] = elements[i];
            }
            elements = newElements;
        }
    }

    public void add(int index, E element) {
        for (int i = size + 1; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = element;
        size++;
        ensureCapacity();
    }

    public E remove(int index) {
        Object temp = elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        return (E) temp;
    }

    public int size() {
        return size;
    }

    public Object[] clone() {
        Object[] newElements = new Object[elements.length];
        for (int i = 0; i < size; i++) {
            newElements[i] = elements[i];
        }
        return newElements;
    }

    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == e) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E e) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == e) {
                return i;
            }
        }
        return -1;
    }

    public boolean add(E e) {
        elements[size++] = e;
        ensureCapacity();
        return true;
    }

    public E get(int index) {
        if (index < size) {
            return (E) elements[index];
        }
        throw new IndexOutOfBoundsException();
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = 0;
        }
    }

    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < size; i++) {
            if (i == 0) {
                str += "[" + elements[i];
            } else if (i == size - 1) {
                str += ", " + elements[i] + "]";
            } else {
                str += ", " + elements[i];
            }
        }
        return str;
    }
}
