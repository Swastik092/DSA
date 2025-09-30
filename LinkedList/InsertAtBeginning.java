class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}

public class InsertAtBeginning{
    Node head;
    void insert(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    void display(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
    public static void main(String[] args) {
        InsertAtBeginning in = new InsertAtBeginning();
        in.insert(30);
        in.insert(20);
        in.insert(10);

        in.display();
    }
}