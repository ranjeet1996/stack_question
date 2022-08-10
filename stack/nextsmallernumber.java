package stack;

import java.util.Stack;

public class nextsmallernumber {
    public static void main( String[] args) {
        int[] arr={3,10,5,1,15,10,7,6};
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        int ans[]=new int[n];
        for(int i=n-1;i>=0;i--){
         while(!st.isEmpty() && st.peek()>=arr[i]){
         st.pop();
        }
        if(st.isEmpty()){
          ans[i]= -1;
        }else{
          ans[i] = st.peek();
        }
        st.push(arr[i]);
         }
         for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
         }
          
    }
    
    
}
