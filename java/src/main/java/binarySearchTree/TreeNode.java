package binarySearchTree;

public class TreeNode {

    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(int data) {
        this.data = data;
    }

    public void insert(int value) {
        if (value == data)
            return;
        if (value < data)
            if (leftChild == null)
                leftChild = new TreeNode(value);
            else
                leftChild.insert(value);
        if (value > data)
            if (rightChild == null)
                rightChild = new TreeNode(value);
            else rightChild.insert(value);
    }

    public void inOrderTraversal() {
        if (leftChild != null)
            leftChild.inOrderTraversal();
        System.out.printf("%d , ", data);
        if (rightChild != null)
            rightChild.inOrderTraversal();
    }

    public void postOrderTraversal() {
        if (leftChild != null)
            leftChild.postOrderTraversal();
        if (rightChild != null)
            rightChild.postOrderTraversal();
        System.out.printf("%d , ", data);
    }

    public void preOrderTraversal() {
        System.out.printf("%d , ", data);
        if (leftChild != null)
            leftChild.preOrderTraversal();
        if (rightChild != null)
            rightChild.preOrderTraversal();
    }
}
