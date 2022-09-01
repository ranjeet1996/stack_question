package queue;


class Node{
    int data;
    Node next;
    Node child;
    Node(int data){
        this.data=data;
        next=child=null;
    }
    public void add(int i) {
    }
}

public class FlattingLinkedlist {
    public static void main(String[] args) {
        
    }

    


public Node flattenlist(Node head){
    if(head==null){
        return null;
    }
    Node temp=null;
    Node tail=head;
    while(tail.next!=null){
        tail=tail.next;
    }
    Node curr=head;
    while(curr!=tail){
        if(curr.child!=null){
            tail.next=curr.child;
            temp=curr.child;
            while(temp.next!=null){
                temp=temp.next;
            }
            tail=temp;
        }
        curr=curr.next;
    }
    return curr;
}
}
