package dataStructures.stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.pop();

        stack.push(30);
        stack.push(40);

        stack.peek();
        System.out.println(stack.getSize());

        stack.printStack();
    }
}
