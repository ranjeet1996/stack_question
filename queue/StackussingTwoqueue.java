package queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackussingTwoqueue {
     class Mystack{
        Deque<Integer> q1=new ArrayDeque<>();
        Deque<Integer> q2=new ArrayDeque<>();
        

        void push(int data){
            while(!q1.isEmpty()){
                q2.push(q1.pop());
            }
            q1.push(data);
            while(!q2.isEmpty()){
                q1.push(q2.pop());
            }
        }
        int pop(){
          return  q1.pop();
        }

        
    }
    public static void main(String[] args) {
            Deque<Integer> d=new ArrayDeque<>();
            d.offer(1);
            d.offer(2);
            d.offer(3);
            System.out.println(d.pop());
            System.out.println(d.peek());
             System.out.println(d);
             d.push(10);
             System.out.println(d);       
    }
    
}
