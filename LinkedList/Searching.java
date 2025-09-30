class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}

public class Searching {
    int search(Node head, int x){
        Node curr = head;
        while(curr != null){
            if(curr.data == x)
                return curr.data;
            curr = curr.next;
        }
        return -1;
    }
}
