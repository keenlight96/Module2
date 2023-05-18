package Task5_id9815;

public class Main {
    public static void main(String[] args) {
        Queue list = new Queue();
        list.enQueue(14);
        list.enQueue(1414);
        list.enQueue(24151);
        list.displayQueue();

        System.out.println();
        list.deQueue();
        list.deQueue();
        list.displayQueue();
    }
}
