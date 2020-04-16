package dataStructures.linkedList.doubly;

import java.util.NoSuchElementException;

public class DoublyLinkedList {
    private Node head;
    private Node tail;

    public void printForwardList() {
        Node node = head;
        System.out.print("Forward list: ");
        while (node != null) {
            System.out.print(node.getData() + " --> ");
            node = node.getNext();
        }
        System.out.println("null");
    }

    public void printBackwardList() {
        Node node = tail;
        System.out.print("BackWord list: ");
        System.out.print("null");
        while (node != null) {
            System.out.print(" --> " + node.getData());
            node = node.getPrevious();
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        if (isEmpty()) tail = node;
        else
            head.setPrevious(node);
        node.setNext(head);
        head = node;
    }

    public void insertLast(int value) {
        if (isEmpty()) {
            insertFirst(value);
            return;
        }
        Node current = head;
        Node node = new Node(value);
        while (current.getNext() != null)
            current = current.getNext();
        current.setNext(node);
        node.setPrevious(current);
        tail = node;
    }

    public void insertAtPosition(int position, int value) {
        if (isEmpty() || position == 0) {
            insertFirst(value);
            return;
        }
        if (getLength() < position) {
            System.out.println("Invalid position to enter the node");
            return;
        }
        int count = 1;
        Node current = head;
        while (count < position) {
            current = current.getNext();
            count++;
        }
        Node node = new Node(value);
        node.setNext(current.getNext());
        node.setPrevious(current);
        current.getNext().setPrevious(node);
        current.setNext(node);
    }

    public int getLength() {
        Node node = head;
        int count = 0;
        if (node == null) return count;
        while (node != null) {
            node = node.getNext();
            count++;
        }
        return count;
    }

    public void deleteLast() {
        Node current = tail;
        if (head == tail)
            head = null;
        else
            current.getPrevious().setNext(null);
        while (current.getNext() != null) {
            current = current.getNext();
        }
        tail = current.getPrevious();
        current.setPrevious(null);
    }

    public void deleteFirst() {
        Node current = head;
        if (head == tail)
            tail = null;
        else
            current.getNext().setPrevious(null);
        head = current.getNext();
        current.setNext(null);

    }

}
