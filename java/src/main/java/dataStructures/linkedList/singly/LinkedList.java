package dataStructures.linkedList.singly;

public class LinkedList {
    private Node head;

    public void insertAtLast(int value) {
        if (head == null) {
            head = new Node(value);
            return;
        }
        Node current = head;
        while (current.getNext() != null) {
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
        current = traverseTillPosition(position, current);
        Node node = new Node(value);
        node.setNext(current.getNext());
        current.setNext(node);
    }

    public void deleteNodeFromLast() {
        Node previous = head;
        previous = traverseTillPosition(length() - 1, previous);
        previous.setNext(null);
    }

    public void deleteFromFirst() {
        if (head == null) {
            System.out.println("List is already empty");
            return;
        }
        Node first = head;
        head = first.getNext();
        first.setNext(null);
    }

    public void deleteFromPosition(int position) {
        if (position == 0) {
            deleteFromFirst();
            return;
        }
        Node previous = head;
        previous = traverseTillPosition(position, previous);
        previous.setNext(previous.getNext().getNext());
    }

    public int length() {
        Node node = head;
        if (node == null)
            return 0;
        int count = 0;
        while (node != null) {
            count++;
            node = node.getNext();
        }
        return count;
    }

    public Node traverseTillPosition(int position, Node node) {
        int count = 1;
        while (count < position) {
            node = node.getNext();
            count++;
        }
        return node;
    }

    public Node searchNode(int index) {
        Node node = head;
        int count = 0;
        while (count < index) {
            node = node.getNext();
            count++;
        }
        return node;
    }


    public void printList() {
        Node node = head;
        while (node != null) {
            System.out.println(node);
            node = node.getNext();
        }
    }

    public void insertSorted(int value) {

    }
}
