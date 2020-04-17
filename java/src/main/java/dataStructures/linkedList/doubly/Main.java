package dataStructures.linkedList.doubly;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

//        list.insertLast(30);
        list.insertLast(40);
//        list.insertAtPosition(1, 50);

//        list.deleteLast();
//        list.deleteFirst();

        list.addBefore(15, 40);

        System.out.println(list.getLength());
        list.printForwardList();

        list.printBackwardList();
    }
}
