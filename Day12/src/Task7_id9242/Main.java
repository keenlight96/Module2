package Task7_id9242;

import Task5_id9244.BST;

public class Main {
    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();
        bst.insert(20);
        bst.insert(10);
        bst.insert(16);
        bst.insert(40);
        bst.insert(30);
        bst.insert(80);

        bst.delete(20);
        bst.inorder();
    }
}
