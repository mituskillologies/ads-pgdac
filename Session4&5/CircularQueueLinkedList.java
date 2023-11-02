public class CircularQueueLinkedList {
    private Node head;
    private Node tail;

    public CircularQueue() {
        head = null;
        tail = null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    public int dequeue() {
        if (head == null) {
            return -1;
        }
        if (head == tail) {
            int data = head.data;
            head = null;
            tail = null;
            return data;
        }
        int data = head.data;
        head = head.next;
        tail.next = head;
        return data;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printQueue() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
            if (current == head) {
                break;
            }
        }
        System.out.println();
    }

    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.printQueue();

        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());

        queue.printQueue();
    }
}

