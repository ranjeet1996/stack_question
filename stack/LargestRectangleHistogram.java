package stack;

import java.util.Stack;

public class LargestRectangleHistogram {
    public static void main(String[] args) {
        int arr[]={4,2,1,5,6,3,2,4,2};
        int n=arr.length;
        int ps[]=prevsmallest(arr);
        int ns[]=nextsmallest(arr);
        int maxans=0;
        for(int i=0;i<n;i++){
            int curr=(ns[i]-ps[i]-1)*arr[i];
            maxans=Math.max(maxans,curr);
        }
        System.out.print(maxans);

        
    }

    

public static int[] prevsmallest(int arr[]) {
    int n=arr.length;
    int pre[]=new int[n];
    Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
         while(!st.isEmpty() && st.peek()>=arr[i]){
         st.pop();
        }
        if(st.isEmpty()){
          pre[i]=-1;
        }else{
          pre[i]=st.peek();
        }
        st.push(arr[i]);
         }

     return pre;
    
}
public static int[] nextsmallest(int arr[]) {
    int n=arr.length;
    int next[]=new int[n];
    Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
         while(!st.isEmpty() && st.peek()<=arr[i]){
         st.pop();
        }
        if(st.isEmpty()){
           next[i]=-1;
        }else{
          next[i]=st.peek();
        }
        st.push(arr[i]);
         }

     return next;
    
}

}
