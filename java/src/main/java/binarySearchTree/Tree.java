package binarySearchTree;

public class Tree {
    private TreeNode root;

    void insert(int value) {
        if (root == null)
            root = new TreeNode(value);
        else
            root.insert(value);
    }
}
