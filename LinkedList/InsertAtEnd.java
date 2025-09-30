class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}

public class InsertAtEnd {
    Node head;

    void end(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node curr = head;
        while(curr.next != null){
            curr=curr.next;
        }
        curr.next = newNode;
    }
    void InsertInMiddle(int data,int pos){
        Node newNode = new Node(data);
        if(pos == 1){
            newNode.next = head;
            head = newNode;
            return;
        }
        Node curr = head;
        for(int i=1;i<pos-1 && curr != null;i++){
            curr = curr.next;
        }
        if(curr == null){
            System.out.println("Invalid input");
            return;
        }
        newNode.next = curr.next;
        curr.next = newNode;
    }

    void Insert(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void display(){
        for(Node curr=head;curr!=null;curr=curr.next){
            System.out.print(curr.data + " ");
        }
        return;
    }

    public static void main(String[] args) {
        InsertAtEnd en = new InsertAtEnd();
        en.Insert(30);
        en.end(10);
        en.Insert(15);
        en.InsertInMiddle(12, 2);
        en.display();
    }
}
// 15 12 30 10