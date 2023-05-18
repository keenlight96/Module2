package Task5_id9815;

public class Queue {
    public Node front;
    public Node rear;

    public Queue() {
        front = null;
        rear = null;
    }

    public void enQueue(int e) {
        if (front == null) {
            front = rear = new Node(e);
        } else {
            rear.link = new Node(e);
            rear = rear.link;
        }
    }

    public void deQueue() {
        if (front == null) {
            return;
        } else if (front == rear){
            front = rear = null;
        } else {
            front = front.link;
        }
    }

    public void displayQueue() {
        Node temp = front;
        while (temp!=null) {
            System.out.println(temp.data);
            temp = temp.link;
        }
    }
}
