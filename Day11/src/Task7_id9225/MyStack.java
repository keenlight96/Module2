package Task7_id9225;

public class MyStack {
    public static void main(String[] args) {
        MyStack stack = new MyStack(20);
        stack.push(15);
        stack.push(47);
        stack.push(477);
        stack.push(14565);
        stack.push(831);

        stack.pop();
        stack.pop();
        stack.pop();
    }

    private int[] arr;
    private int capacity;
    private int index = -1;

    public MyStack(int capacity) {
        this.capacity = capacity;
        arr = new int[this.capacity];
    }

    public boolean isFull() {
        return index == capacity;
    }

    public boolean isEmpty() {
        return index == -1;
    }

    public void push(int e) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        index++;
        arr[index] = e;
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Removed " + arr[index]);
        arr[index] = 0;
        index--;
    }
}
