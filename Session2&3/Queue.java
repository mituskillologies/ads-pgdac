public class Queue {

    private int front, rear, capacity;
    private int[] queue;

    public Queue(int capacity) {
        this.front = 0;
        this.rear = 0;
        this.capacity = capacity;
        this.queue = new int[capacity];
    }

    public void enqueue(int element) {
        if (rear == capacity) {
            System.out.println("Queue is full");
            return;
        }

        queue[rear] = element;
        rear++;
    }

    public int dequeue() {
        if (front == rear) {
            System.out.println("Queue is empty");
            return -1;
        }

        int element = queue[front];
        front++;
        return element;
    }

    public int peek() {
        if (front == rear) {
            System.out.println("Queue is empty");
            return -1;
        }

        return queue[front];
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public boolean isFull() {
        return rear == capacity;
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.enqueue(5);
        queue.enqueue(8);
        queue.enqueue(2);
        queue.enqueue(7);
        queue.enqueue(4);

        System.out.println(queue.dequeue()); // 1
        System.out.println(queue.dequeue()); // 2
        System.out.println(queue.dequeue()); // 3

        System.out.println(queue.peek()); // 4
        System.out.println(queue.isEmpty()); // false
        System.out.println(queue.isFull()); // false
    }
}
