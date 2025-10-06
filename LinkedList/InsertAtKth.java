class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}

public class InsertAtKth {
    Node head;
    Node delete(int k){
        if(head.next == null)
            return null;
        if(k == 1){
            head = head.next;
            return head;
        }   
        Node curr = head;
        for(int i=0;i<k-2;i++){
            curr = curr.next;
        }
        curr.next = curr.next.next;
    return head;
    }
}
