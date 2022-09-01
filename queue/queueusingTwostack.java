package queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class queueusingTwostack {
    static class Myqueue{
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();

        public void push(int x) {
           s1.push(x);
        }
        public int pop() {
               while(!s1.isEmpty()){
                s2.push(s1.pop());
               }
               int ans=s2.pop();
               while(!s2.isEmpty()){
                s1.push(s2.pop());
               }
               return ans;
        }
        
        public int peek() {
            while(!s1.isEmpty()){
                s2.push(s1.pop());
               }
               int ans=s2.peek();
               while(!s2.isEmpty()){
                s1.push(s2.pop());
               }
               return ans;
        }
        
        public boolean empty() {
                if(s1.size()==0 && s2.size()==0) return true;
                else return false;
             
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
    
}
