import java.util.*;

class Node {
    int value;
    Node next; //next node, next pointer\
    Node prev;

    Node(int nodeValue) {
        value = nodeValue;
    }
}

public class test {
    static Node head = null; 
    


    static void insertAtPos(int pos, int val) {
        //pos is valid? how find invalid, len
        Node temp = new Node(val);
        if (pos == 1) {
            temp.next = head;
            head = temp;
        } else {
            Node run = head;
            // stand position before node
            for (int i = 2; i <= pos - 1; i++) {
                run = run.next;
            }
            //temp.next is pointing to next element of run
            //
            temp.next = run.next;
            run.next = temp;
        }
    }

    public static void printLL() {
        Node run = head;
        while (run != null) {
            System.out.print(run.value + " ");
            run = run.next;
        }
        System.out.println();
    }

   
    public static void ReverseLinkedList() {
		// return the head of the modified linked list
    // if(head==null || head.next==null){
    //     return;
    // }
    // Node prev=head;
    // Node curr=head.next;
    // while(curr!=null){
    //     Node next=curr.next;
    //     curr.next=prev;
    //     prev=curr;
    //     curr=next;
    // }
    // head.next=null;
    // head=prev;
    Node prev=null;
    Node curr=head;
    while(curr!=null){
        Node temp=curr.next;
        curr.next=prev;
        prev=curr;
        curr=temp;
    }
   head.next=null;
   head=prev;
    
 }

 public static Node addElement( int k) {
    //enter your code here
    Node temp=new Node(k);
    if(head==null){
        head=temp;
    }
    else{
        temp.next=head;
        head=temp;
    }
    return head;
    }

    public static Node deleteElement(int k) {
        Node dummy=new Node(-1);
        dummy.next=head;
        Node p1=dummy;
        Node p2=dummy;
        for(int i=0;i<k;i++){
            p1=p1.next;
        }
        while(p1.next!=null){
            p1=p1.next;
            p2=p2.next;
        }
        p2.next=p2.next.next;
        return dummy.next;
        }

        public static Node deleteElement2(int k) {
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


     static  boolean isPalin()
     {
      if(head==null){
         return true;
      }
      Node right =head;
      while(right.next!=null){
         right=right.next;
      }

      while(head!=right){
         if(head.value!=right.value){
            return false;
         }
         head=head.next;
         right= right.prev;
      }

      return true;

   }
        

   static void insertAtEnd(int number) {
    Node temp = new Node(number);
    if (head == null) {
        head = temp;
    } else {
        Node run = head;
        while (run.next != null) {
            run = run.next;
        }
        run.next = temp;
        temp.prev = run; // added -> point to prev node
    }
}

   static  Node mergeSort(Node head) {
    Node curr=head;
     if(curr!=null || curr.next!=null)
     return head;
    Node mid= findmiddle(head);
     Node left=head;
     Node right=mid.next;
     mid.next=null;
    left= mergeSort(left);
    right= mergeSort(right);
     Node result=mergeboth(left,right);
     return result;
 }
 
    static Node mergeboth(Node first,Node second){
         Node ans=null;
         if(first!=null) return second;
         else if(second!=null) return first;
         else if(first.value<=second.value){
             ans=first;
             ans.next=mergeboth(first.next,second);
         }else{
              ans=second;
             ans.next=mergeboth(first,second.next);
         }
         return ans;
     }
      static Node findmiddle(Node head){
         Node slow=head;
         Node fast=head;
         while(fast!=null &&fast.next!=null){
             slow=slow.next;
             fast=fast.next.next;
         }
       return slow;
     }



       
        

    public static void main(String[] args) {

        // insertAtPos(1, 2);
        // insertAtPos(1, 190);
        // insertAtPos(3, 150);
        // insertAtPos(4, 20);
        // printLL();
        // ReverseLinkedList();
        // printLL();
        // addElement( 2);
        // printLL();
        // deleteElement(2);
        // printLL(); 
        // deleteElement2( 3);
        insertAtEnd(242);
        insertAtEnd(2);
        insertAtEnd(23);
        
        printLL();
        mergeSort(head);
        printLL();

     
    }

   

   
}