package Task9_id9245;

import Task5_id9244.BST;

public class Main {
    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();
        bst.insert(14);
        bst.insert(35);
        bst.insert(114);
        bst.insert(-14);
        bst.insert(1);
        bst.insert(-12514);

        bst.search(1);
    }
}
