import java.util.Scanner;

class Node {
    Node next;
    Node prev;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
        prev = null;
    }
} 


public class test {
    public static void main(String[] args) {
       
    }

    public static Node deleteElement(Node head,int k) {
    //enter your code here
      Node dummy=new Node(-1);
        Node p1=dummy;
        Node p2=dummy;
        p1.next=head;
        p2.next=head;
        for(int i=0;i<k;i++){
           p1= p1.next;
        }
        while(p1.next!=null){
            p1=p1.next;
            p2=p2.next;
        }
        p2.next=p2.next.next;
         if(p2.next!=null) p2.next.prev=p2;
        return dummy.next;
    }
    }

