package stack;

import java.util.Stack;

public class CelibratyProblum {
    public static void main(String[] args) {
        int[][] arr={
            {0,1,1,1},
            {1,0,1,1},
            {0,0,0,0},
            {1,1,1,0}

        };
        findcelibraty(arr);
    }

    
    public static void findcelibraty(int arr[][] ) {
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            st.push(i);
        }
        while(st.size()>=2){
            int a=st.pop();
            int b=st.pop();
            if(arr[a][b]==1){
                st.push(b); //a knows b->a is poped;
            }else{
                st.push(a);
            }
        }
        int potential=st.pop();
        for(int i=0;i<n;i++){
            if(i!=potential){
                if(arr[i][potential]==0 || arr[potential][i]==1){
                     System.out.print("none");
                     return;
                }
            }
        }
        System.out.print(potential);
    }
   
}
