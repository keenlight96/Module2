package Task3_id9221;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Integer
        Stack<Integer> listInt = new Stack<>();
        listInt.push(15);
        listInt.push(1);
        listInt.push(-124);
        listInt.push(41242);
        listInt.push(1145);
        System.out.println(listInt);

        Stack<Integer> newListInt = new Stack<>();
        int size = listInt.size();
        for (int i = 0; i < size; i++) {
            newListInt.push(listInt.pop());
        }
        System.out.println(newListInt);

        // String
        String text = "Nguyễn Kim Long";
        Stack<String> str = new Stack<>();
        while (text.contains(" ")) {
            str.push(text.substring(0,text.indexOf(" ")));
            text = text.substring(text.indexOf(" ")+1);
        }
        str.push(text);
        System.out.println(str);
        int sizeStr = str.size();
        for (int i = 0; i < sizeStr; i++) {
            System.out.println(str.pop());
        }
    }
}
