class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data = data;
        next = null;
        prev = null;
    }
}

public class DoublyLinkedlist {
    public static void main(String[] args) {
        Node newNode = new Node(10);
        Node newNode1 = new Node(20);
        Node newNode2 = new Node(30);
        newNode.next = newNode1;
        newNode1.prev = newNode;
        newNode1.next = newNode2;
        newNode2.prev = newNode1;   
    }
}
