package Task6_id9224;

public class MyQueue {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(10);
        queue.enqueue(14);
        queue.enqueue(251);
        queue.enqueue(12414);
        queue.enqueue(245);
        queue.enqueue(7653);
        queue.enqueue(42625);

        queue.dequeue();
        queue.dequeue();
    }
    private int capacity;
    private int[] arr;
    private int head = 0;
    private int tail = -1;
    private int size = 0;

    public MyQueue(int queueSize) {
        capacity = queueSize;
        arr = new int[capacity];
    }

    public boolean isQueueFull() {
        if (size == capacity)
            return true;
        return false;
    }

    public boolean isQueueEmpty() {
        if (size == 0)
            return true;
        return false;
    }

    public void enqueue(int e) {
        if (isQueueFull()) {
            System.out.println("Queue is full");
            return;
        }

        tail++;
        arr[tail] = e;
        size++;
    }

    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Removed " + arr[head]);
        for (int i = 0; i < tail; i++) {
            arr[i] = arr[i+1];
        }
        arr[tail] = 0;
    }
}
