package dataStructures.linkedList.singly;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
//        linkedList.insertAtLast(10);
//        linkedList.insertAtLast(20);
//        linkedList.insertAtBeginning(30);
//        linkedList.insertAtLast(40);
//        linkedList.insertAtPosition(0, 50);
//        linkedList.insertAtPosition(3, 60);
        linkedList.insertSorted(45);
        linkedList.insertSorted(49);
        linkedList.insertSorted(43);
        linkedList.insertSorted(40);
        linkedList.insertSorted(44);
        linkedList.printList();
    }
}
