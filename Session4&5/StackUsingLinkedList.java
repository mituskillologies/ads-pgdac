import java.util.*;
public class StackUsingLinkedList {
    private Node top;   
    private static class Node {
        private int data;
        private Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void push(int element) {
        Node newNode = new Node(element);
        newNode.next = top;
        top = newNode;
    }
    public int pop() {
        if (top == null) {
            throw new EmptyStackException();
        }
        int element = top.data;
        top = top.next;
        return element;
    }

    public int peek() {
        if (top == null) {
            throw new EmptyStackException();
        }

        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();

        stack.push(45);
        stack.push(28);
        stack.push(12);

        System.out.println(stack.pop()); // 30
        System.out.println(stack.pop()); // 20
        System.out.println(stack.pop()); // 10

        System.out.println(stack.isEmpty()); // true
    }
}
