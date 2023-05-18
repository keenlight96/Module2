package Task2_id9220;

public class MyLinkedListQueue<T> {
    public Node head;
    public Node tail;

    public MyLinkedListQueue() {
        head = null;
        tail = null;
    }

    public void enqueue(int key) {
        Node temp = new Node(key);
        if (head == null) {
            head = tail = temp;
        }
        tail.next = temp;
        tail = temp;
    }

    public Node dequeue() {
        if (head == null) {
            return null;
        }
        Node holder = head;
        head = head.next;

        if (head == null) {
            tail = null;
        }

        return holder;
    }

    @Override
    public String toString() {
        String str = "";
        Node temp = head;
        if (temp != null) {
            str += "[" + temp.key;
            temp = temp.next;
        }
        while (temp != null) {
            str += ", " + temp.key;
            temp = temp.next;
        }
        str += "]";
        return str;
    }
}
