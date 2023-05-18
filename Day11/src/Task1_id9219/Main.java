package Task1_id9219;

public class Main {
    public static void main(String[] args) {
        MyGenericStack<Integer> stackInt = new MyGenericStack<>();
        System.out.println(stackInt.isEmpty());
        stackInt.push(14);
        stackInt.push(25);
        stackInt.push(62);
        stackInt.push(25235);
        System.out.println(stackInt);

        System.out.println(stackInt.pop());
        System.out.println(stackInt);
    }
}
