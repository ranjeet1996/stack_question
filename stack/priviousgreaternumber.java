package stack;

import java.util.Stack;

public class priviousgreaternumber {
    public static void main( String[] args) {
        int[] arr={4,10,5,8,20,15,3,12};
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
         while(!st.isEmpty() && st.peek()<=arr[i]){
         st.pop();
        }
        if(st.isEmpty()){
          System.out.print(-1+" ");
        }else{
          System.out.print(st.peek()+" ");
        }
        st.push(arr[i]);
         }
          
    }
    
}
