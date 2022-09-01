import java.util.*;

class Node{
    int value;
    Node next;
    Node(int value){
        this.value=value;
    }
}


public class test2 {
    static Node head=null;


    static void insert(int number){
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

    static void delet(int k){
        if(k==1){
            head=head.next;
        }else{
            Node run=head;
            for(int i=2;i<k-1;i++){
                run=run.next;
            }
            run.next=run.next.next;
        }

    }
   public static void print(){
        Node run=head;
        while(run!=null){
            System.out.print(run.value+" ");
            run=run.next;
        }
        System.out.println("");
    }



    public static void main(String[] args) {
        insert(1);
        insert(2);
        insert(3);
        insert(4);
        print();
        delet(2);
        print();
    }

    
}
