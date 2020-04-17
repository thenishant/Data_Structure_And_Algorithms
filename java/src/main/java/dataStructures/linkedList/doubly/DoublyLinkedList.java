package dataStructures.linkedList.doubly;

import javax.swing.plaf.IconUIResource;
import java.sql.SQLOutput;
import java.util.NoSuchElementException;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;

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
        size++;
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
        size++;

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
        size++;

    }

    public void addBefore(int newData, int existingData) {
        Node node = new Node(newData);
        Node current = head;
        if (isEmpty() || current == tail) {
            insertFirst(newData);
            return;
        }
        while (current.getData() != existingData) {
            current = current.getNext();
        }
        node.setNext(current);
        node.setPrevious(current.getPrevious());
        current.setPrevious(node);
        current.getPrevious().setNext(node);
        size++;

    }

    public int getLength() {
        return size;
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
        size--;
    }

    public void deleteFirst() {
        Node current = head;
        if (head == tail)
            tail = null;
        else
            current.getNext().setPrevious(null);
        head = current.getNext();
        current.setNext(null);
        size--;
    }

}
