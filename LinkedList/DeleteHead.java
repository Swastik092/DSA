class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
} 

public class DeleteHead {
    Node DeleteFirstNode(Node head){
        if(head == null){
            System.out.println("The list is empty.");
        }
        head = head.next;
        return head;
    }

    Node DeleteLastNode(Node head){
        if(head == null) 
            return null;
        if(head.next == null)
            return null;
        Node curr = head;
        while(curr.next.next != null){
            curr = curr.next;
        }
        curr.next = null;
        return head;
    }
}
