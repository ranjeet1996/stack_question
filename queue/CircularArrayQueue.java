package queue;

class CircularArray{
    int n;
    int arr[];
    int front=-1;int rear=-1;
    public CircularArray(int n){
        this.n=n;
        arr=new int[n];
    }

    void enqueue(int data){
        if((rear+1)%n==front){
            System.out.println("queue is full");
        }
        if(front==-1){
            front=0;
        }
        rear=(rear+1)%n;
        arr[rear]=data;
    }
    void dequeue(){
        if(front==-1){
            System.out.println("queue is Empty");
        }
        int result=arr[front];
        if(front==rear){
            front=rear=-1;
        }else{
            front=(front+1)%n;
        }
        System.out.print(result);
    }
    void peek(){
        if(front==-1){
            System.out.println("queue is empty");
        }else{
            System.out.println(arr[front]);
        }
    }

}
public class CircularArrayQueue {
    public static void main(String[] args) {
               CircularArray cq = new CircularArray(1);
               cq.enqueue(10);
               cq.enqueue(20);
               cq.peek();
               cq.enqueue(30);
                cq.dequeue();
               cq.enqueue(40);
                cq.dequeue();
               cq.enqueue(50);
               cq.peek();
    }
}
