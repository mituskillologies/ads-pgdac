public class CircularQueue {

    private int[] queue;
    private int front;
    private int rear;
    private int size;

    public CircularQueue(int size) {
        this.queue = new int[size];
        this.front = -1;
        this.rear = -1;
        this.size = size;
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public boolean isFull() {
        return (rear + 1) % size == front;
    }

    public void enqueue(int element) {
        if (isFull()) {
            throw new RuntimeException("Queue is full");
        }

        rear = (rear + 1) % size;
        queue[rear] = element;

        if (front == -1) {
            front = rear;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        int element = queue[front];
        front = (front + 1) % size;

        return element;
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }

        return queue[front];
    }

    public void display() {
        System.out.println("Queue: ");
        for (int i = front; i != rear+1; i = (i + 1) % size) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);

        // Enqueue some elements
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(2);
        queue.enqueue(4);

        // Display the queue
        queue.display();

        // Dequeue some elements
        int element = queue.dequeue();
        System.out.println("Dequeued element: " + element);

        queue.dequeue();

        // Display the queue
        queue.display();
    }
}

