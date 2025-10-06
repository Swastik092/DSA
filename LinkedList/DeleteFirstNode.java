class Node{
    int data;
    Node prev,next;
    Node(int data){
        this.data = data;
        prev = next = null;
    }
}

public class DeleteFirstNode {
    Node DeleteFirst(Node head){
        if(head == null){
            System.out.print("The list is empty.");
            return null;
        }
        if(head.next == null){
            return null;
        }
        head = head.next;
        head.prev = null;
        return head;
    }

    Node deleteLast(Node head){
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
