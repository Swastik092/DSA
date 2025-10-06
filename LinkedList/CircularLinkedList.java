class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}

public class CircularLinkedList {
    Node head;
    void display(){
        if(head == null){
            System.out.println("The list is empty.");
            return;
        }
        System.out.print(head.data + " ");
        Node curr = head.next;
        while(curr != head){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    void InsertAtBeginning(int x){
        Node newNode = new Node(x);
        if(head == null){
            newNode.next = newNode;
            head = newNode;
            return;
        }
        Node curr = head;
        while(curr.next != head){
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.next  = head;
        head = newNode;
    }

    void InsertAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            newNode.next = newNode;
            head = newNode;
            return;
        }
        Node curr = head;
        while(curr.next != head){
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.next = head;
    }

    Node DeleteFirst(){
        if(head == null){
            return null;
        }
        if(head.next == head){
            Node temp = head;
            head = null;
            return temp;
        }
        Node curr = head;
        while(curr.next != head){
            curr = curr.next;
        }
        Node temp = head;
        head = head.next;
        curr.next = head;
        return temp;
    }

    public static void main(String[] args) {
        CircularLinkedList cr = new CircularLinkedList();
        cr.InsertAtBeginning(10);
        cr.InsertAtEnd(20);
        cr.InsertAtBeginning(30);
        cr.InsertAtEnd(40);
        cr.InsertAtBeginning(50);
        cr.display();
        cr.DeleteFirst();
        cr.DeleteFirst();
        cr.DeleteFirst();
        cr.display();
    }
}
