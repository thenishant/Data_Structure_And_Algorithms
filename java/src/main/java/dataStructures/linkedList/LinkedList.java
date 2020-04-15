package dataStructures.linkedList;

public class LinkedList {
    private Node head;

    public void insertAtLast(int value) {
        if (head == null) {
            head = new Node(value);
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.getNext();
        }
        current.setNext(new Node(value));
    }

    public void insertAtBeginning(int value) {
        Node node = new Node(value);
        node.setNext(head);
        head = node;
    }

    public void insertAtPosition(int position, int value) {
        if (position == 0) {
            insertAtBeginning(value);
            return;
        }
        Node current = head;
        int count = 1;
        while (count < position) {
            current = current.getNext();
            count++;
        }
        Node node = new Node(value);
        node.setNext(current.getNext());
        current.setNext(node);
    }


    public void printList() {
        Node node = head;
        while (node != null) {
            System.out.println(node);
            node = node.getNext();
        }
    }
}
