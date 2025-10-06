class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}

public class sortedInsert {
    Node head;
    Node Insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return head;
        }else if(data < head.data){
            newNode.next = head;
            head = newNode;
            return head;
        }
        Node curr = head;
        while(curr.next!= null && curr.next.data < data){
            curr = curr.next;
        }
        newNode.next = curr.next;
        curr.next = newNode;
        return head;
    }
}
