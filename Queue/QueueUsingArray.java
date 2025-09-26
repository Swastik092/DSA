class QueueUsingArray {
    private int front, rear, capacity;
    private int[] arr;

    public QueueUsingArray(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
    }

    public boolean isFull() {
        return rear == capacity - 1;
    }

    public boolean isEmpty() {
        return front > rear;
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full! Cannot enqueue " + data);
            return;
        }
        arr[++rear] = data;
        System.out.println(data + " enqueued to queue");
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty! Cannot dequeue.");
            return -1;
        }
        return arr[front++];
    }

    public int getFront() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return arr[front];
    }

    public int getRear() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return arr[rear];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueUsingArray q = new QueueUsingArray(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.display();
        System.out.println("Dequeued: " + q.dequeue());
        System.out.println("Front element: " + q.getFront());
        System.out.println("Rear element: " + q.getRear());
        q.display();
        q.enqueue(60);
    }
}
