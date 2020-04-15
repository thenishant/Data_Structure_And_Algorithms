package dataStructures.linkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.insertAtLast(1);
        linkedList.insertAtLast(2);
        linkedList.insertAtBeginning(3);
        linkedList.insertAtLast(4);
        linkedList.insertAtPosition(0, 5);
        linkedList.insertAtPosition(1, 6);
        linkedList.printList();
    }
}
