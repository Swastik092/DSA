class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data = data;
        next = prev = null;
    }
}

public class InsertAtFrontDlinkedlist {
    Node head;
    void InsertAtBeginning(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    void InsertAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.prev = curr;
        newNode.next = null;
    }

    void display(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        InsertAtFrontDlinkedlist in = new InsertAtFrontDlinkedlist();
        in.InsertAtBeginning(10);
        in.InsertAtBeginning(70);
        in.InsertAtBeginning(50);
        in.InsertAtEnd(1);
        in.InsertAtBeginning(30);
        in.InsertAtBeginning(20);
        in.display();
    }
}
