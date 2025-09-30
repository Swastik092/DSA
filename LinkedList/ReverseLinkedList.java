class Node{
    int data;
    Node next, prev;
    Node(int data){
        this.data = data;
        prev = next = null;
    }
}

public class ReverseLinkedList {
    Node reverse(Node head){
        Node curr = head;
        while(curr.next != null){
            Node temp = curr.next;
            curr.next = curr.prev;
            curr.prev = temp;

            curr = curr.prev;
        }
        return head;
    }
}
