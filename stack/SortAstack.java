package stack;

import java.util.Stack;



public class SortAstack {
    public static void main(String[] args) {
        int arr[]={23,92,98,31,3,34};
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        Stack<Integer> temp=new Stack<>();
        for(int i=0;i<n;i++){
            st.push(arr[i]);
        }
        while(!st.isEmpty()){
            int k=st.peek();
            st.pop();
            while(!temp.isEmpty()&& temp.peek()<k){
                st.push(temp.peek());
                temp.pop();
            }
                temp.push(k);
            
        }
        while(!temp.isEmpty()){
            System.out.print(temp.peek()+" ");
            temp.pop();
        }

    }
    
}
