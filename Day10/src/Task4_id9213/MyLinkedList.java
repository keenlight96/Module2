package Task4_id9213;

import Task3_id9212.MyList;

public class MyLinkedList<E> {
    Node head;
    int numNodes = 0;

    class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }

    public MyLinkedList(Object data) {
        head = new Node(data);
        numNodes++;
    }

    public void add(int index, E e) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp != null; i++) {
            temp = temp.next;
        }

        holder = temp.next;
        temp.next = new Node(e);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(E e) {
        Node holder = head;
        head = new Node(e);
        head.next = holder;
        numNodes++;
    }

    public void addLast(E e) {
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(e);
        numNodes++;
    }

    public E remove(int index) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = temp.next.next;
        numNodes--;
        return (E) holder.getData();
    }

    public boolean remove(E e) {
        boolean check = false;
        Node temp = head;
        while (head.getData() == e) {
            check = true;
            head = temp.next;
            temp = head;
            numNodes--;
        }

        while (temp.next != null) {
            while (temp.next.getData() == e) {
                check = true;
                temp.next = temp.next.next;
                numNodes--;
            }
            temp = temp.next;
        }
        return check;
    }

    public int size() {
        return numNodes;
    }

    public boolean contains(E e) {
        Node temp = head;
        while (temp != null) {
            if (temp.getData() == e) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(E e) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            if (temp.getData() == e) {
                return count;
            }
            temp = temp.next;
            count++;
        }
        return -1;
    }

    public E get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return (E) temp.getData();
    }

    public E getFirst() {
        return (E) head.getData();
    }

    public E getLast() {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return (E) temp.getData();
    }

    @Override
    public String toString() {
        String str = "";
        Node temp = head;
        str += "[" + temp.getData();
        while (temp.next != null) {
            temp = temp.next;
            str += ", " + temp.getData();
        }
        str += "]";
        return str;
    }
}
