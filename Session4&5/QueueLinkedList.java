public class QueueLinkedList {

    private Node head;
    private Node tail;

    public QueueLinkedList() {
        this.head = null;
        this.tail = null;
    }
    
    private static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    public boolean isEmpty() {
        return head == null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        int data = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }

        return data;
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        return head.data;
    }

    public static void main(String[] args) {
        QueueLinkedList queue = new QueueLinkedList();

        // Enqueue some elements
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        // Display the queue
        System.out.println("Queue: ");
        Node current = queue.head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();

        // Dequeue an element
        int element = queue.dequeue();
        System.out.println("Dequeued element: " + element);

        // Display the queue
        System.out.println("Queue: ");
        current = queue.head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

