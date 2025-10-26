class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}

public class MyStackLinkedList {
    Node head;
    int size;
    public MyStackLinkedList() {
        head = null;
        size = 0;
    }
    void push(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }
    int pop(){
        if(head == null){
            return -1;
        }
        int temp = head.data;
        head = head.next;
        size--;
        return temp;
    }
    int size(){
        return size;
    }
    boolean isEmpty(){
        return size == 0;
    }
    int peek(){
        return head.data;
    }
    public static void main(String[] args) {
        MyStackLinkedList s = new MyStackLinkedList();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println("Popped element: " + s.pop());
        System.out.println("Top element:" + s.peek());
        System.out.println("Stack is empty?:" + s.isEmpty());
        System.out.println("Size of the array:" +s.size());
    }
}
