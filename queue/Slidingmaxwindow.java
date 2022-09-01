package queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Slidingmaxwindow {
    public static void main(String[] args) {
        int arr[]={4,1,3,5,1,2,3,2,1,1,5};
        printmax(arr, arr.length, 3);
        
    }
   public static void printmax(int arr[],int n,int k){
        Deque<Integer> dq=new ArrayDeque<>();
        
        for(int i=0;i<k;++i){
            while((!dq.isEmpty()) &&arr[i]>=arr[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        
        for(int i=k;i<n;++i){
            System.out.print(arr[dq.peek()]+" ");
            while((!dq.isEmpty()) && dq.peek()<=i-k ){
                dq.removeFirst();
            }
            while((!dq.isEmpty()) &&arr[i]>=arr[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);

        }
        System.out.print(arr[dq.peek()]+" ");

    }
    
}
