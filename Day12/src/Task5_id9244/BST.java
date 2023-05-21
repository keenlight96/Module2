package Task5_id9244;

public class BST<E extends Comparable<E>> extends AbstractTree<E>{
    protected TreeNode<E> root;
    protected int size = 0;

    public BST() {
    }

    public BST(E[] objects) {
        for (int i = 0; i < objects.length; i++) {
            insert(objects[i]);
        }
    }

    public TreeNode<E> createNewNode(E e) {
        return new TreeNode<>(e);
    }
    @Override
    public boolean insert(E e) {
        if (root == null) {
            root = createNewNode(e);
        } else {
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null) {
                if (e.compareTo(current.element) < 0) {
                    parent = current;
                    current = current.left;
                } else if (e.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                } else
                    return false;
            }

            if (e.compareTo(parent.element) < 0)
                parent.left = createNewNode(e);
            else
                parent.right  = createNewNode(e);
        }
        size++;
        return true;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void inorder() {
        inorder(root);
    }

    public void inorder(TreeNode<E> root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.println(root.element + " ");
        inorder(root.right);
    }
    
    //For next tasks
    public void postOrder() {
        postOrder(root);
    }

    public void postOrder(TreeNode<E> root) {
        if (root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.element + " ");
    }

    public void delete(E e) {
        TreeNode<E> current = root;
        TreeNode<E> parent = null;
        while (current.element != e) {
            if (e.compareTo(current.element) < 0) {
                parent = current;
                current = current.left;
            } else if (e.compareTo(current.element) > 0) {
                parent = current;
                current = current.right;
            }
            if (current == null)
                return;
        }

        if (current.left == null) {
            if (current == parent.left) {
                parent.left = current.right;
            } else
                parent.right = current.right;
        } else {
            TreeNode<E> rightMost = current.left;
            TreeNode<E> rightMostParent = current;
            while (rightMost.right != null) {
                rightMostParent = rightMost;
                rightMost = rightMost.right;
            }
            current.element = rightMost.element;
            rightMostParent.right = rightMost.left;
        }
    }
}
