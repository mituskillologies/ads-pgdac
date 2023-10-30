import java.util.*;
public class Stack {
    private int[] stack;
    private int top;

    public Stack() {
        stack = new int[10];
        top = -1;
    }

    public void push(int element) {
        if (top == stack.length - 1) {
            // Stack is full, resize it
            stack = Arrays.copyOf(stack, stack.length * 2);
        }
        top++;
        stack[top] = element;
    }

    public int pop() {
        if (top == -1) {
            // Stack is empty, throw an exception
            throw new EmptyStackException();
        }
        int element = stack[top];
        top--;
        return element;
    }

    public int peek() {
        if (top == -1) {
            // Stack is empty, throw an exception
            throw new EmptyStackException();
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop()); // 3
        System.out.println(stack.pop()); // 2
        System.out.println(stack.pop()); // 1
        System.out.println(stack.isEmpty()); // true
    }
}
