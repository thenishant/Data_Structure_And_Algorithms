package dataStructures.stack;

public class Stack {
    private Node top;
    private int size;

    public Boolean isEmpty() {
        return top == null;
    }

    public int getSize() {
        return size;
    }

    public Node peek() {
        return top;
    }

    public void push(int data) {
        Node node = new Node(data);
        node.setNext(top);
        top = node;
        size++;
    }

    public int pop() {
        int data = top.getData();
        top = top.getNext();
        size--;
        return data;
    }


    public void printStack() {
        Node node = top;
        while (node != null) {
            System.out.println(node.getData());
            node = node.getNext();
        }
    }
}
