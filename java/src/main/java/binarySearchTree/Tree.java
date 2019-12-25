package binarySearchTree;

public class Tree {
    private TreeNode root;

    void insert(int value) {
        if (root == null)
            root = new TreeNode(value);
        else
            root.insert(value);
    }

    public void inOrderTraversal() {
        if (root != null)
            root.inOrderTraversal();
    }

    public void postOrderTraversal() {
        if (root != null)
            root.postOrderTraversal();
    }

    public void preOrderTraversal() {
        if (root != null)
            root.preOrderTraversal();
    }
}
