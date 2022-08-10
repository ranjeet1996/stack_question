package stack;

import java.util.ArrayList;
import java.util.Stack;

public class stockSpan2 {
    public static void main (String[] args) {
        int[] arr={10,20,15,10,25,22};
        // int[] ans=new int[arr.length];
        ArrayList<Integer> ans=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        st.push(0);
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()]<=arr[i]){
                st.pop();
            }if(st.isEmpty()){
                ans.add(i+1);
            }else{
                ans.add(i-st.peek());
            }
            st.push(i);
          }
          
        System.out.print(ans+" ");
        
        

    }
}
