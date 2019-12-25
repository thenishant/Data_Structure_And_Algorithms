package binarySearchTree;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(25);
        tree.insert(20);
        tree.insert(27);
        tree.insert(15);
        tree.insert(22);
        tree.insert(26);
        tree.insert(30);
        tree.insert(29);
        tree.insert(32);

        System.out.println("Pre-Order");
        tree.preOrderTraversal();
        System.out.println("\n In-Order");
        tree.inOrderTraversal();
        System.out.println("\n Post-Order");
        tree.postOrderTraversal();
    }
}
