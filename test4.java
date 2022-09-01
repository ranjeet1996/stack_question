

 
public class test4 {
   static class Node {
        int data;
        Node next; //next node, next pointer\
        Node prev;
    
        Node(int nodeValue) {
            data = nodeValue;
        }
    }
   
    static Node head=null;
    public static void main(String[] args) {
        insert(3);
        insert(5);
        insert(2);
        insert(7);
        print();
        reverse();
        print();
        
        
    }
   public static void insert(int number){
        Node temp=new Node(number);
        if(head==null){
            head=temp;
        }else{
            Node run=head;
            while(run.next!=null){
                run=run.next;
            }
            run.next=temp;
        }
    }

    public static void print() {
        Node run = head;
        while (run != null) {
            System.out.print(run.data + " ");
            run = run.next;
        }
        System.out.println();
    }

   public static void reverse(){
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
}

   
