public class CircularQueue{
    private int front, rear, size, capacity;
    private int[] arr;

    public CircularQueue(int capacity){
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isFull(){
        return size == capacity;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void enqueue(int data){
        if (isFull()){
            System.out.println("Queue is full! Cannot enqueue " + data);
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = data;
        size++;
        System.out.println(data + " enqueued to queue");
    }

    public int dequeue(){
        if (isEmpty()){
            System.out.println("Queue is empty! Cannot dequeue.");
            return -1;
        }
        int item = arr[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    public int getFront(){
        if (isEmpty()){
            System.out.println("Queue is empty!");
            return -1;
        }
        return arr[front];
    }

    public int getRear(){
        if (isEmpty()){
            System.out.println("Queue is empty!");
            return -1;
        }
        return arr[rear];
    }

    public void display(){
        if (isEmpty()){
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i < size; i++){
            System.out.print(arr[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    // Main function for testing
    public static void main(String[] args){
        CircularQueue q = new CircularQueue(5);

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
        q.display();
    }
}

