package stack;

import java.util.Stack;

public class maxAreaRectangle {
    public static void main (String[] args) {
        int[][] arr={
            {1,1,0,1,1},
            {1,1,1,1,1},
            {0,1,1,1,1},
            {1,1,1,1,1},
            {1,0,1,1,1},
            {1,1,1,1,1}

        };
        System.out.print(maxrectangle(arr));
    }
     public static int maxrectangle(int[][] a){
        int[] currrow=a[0];
        int maxans=histogram(currrow);
        for(int i=1;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(a[i][j]==1){
                    currrow[j]+=1;
                }else{
                    currrow[j]=0;
                }
            }
            int currans=histogram(currrow);
            maxans=Math.max(currans,maxans);
        }
        return maxans;
    }
    public static int histogram(int[] arr){  
        int n=arr.length; 
        Stack<Integer> st=new Stack<>();
        int max=0;
        int i=0;
        while(i<n){
            if(st.isEmpty() || arr[st.peek()]<=arr[i]){
                st.push(i++);
            }else{
                int t= st.peek();
                st.pop();
                int ans=arr[t]*(st.isEmpty()?i: i-st.peek()-1);
                max=Math.max(max,ans);
            }
        }
        while(!st.isEmpty()){
             int t= st.peek();
                st.pop();
                int ans=arr[t]*(st.isEmpty()? i: i-st.peek()-1);
                max=Math.max(max,ans);
        }
        return max;
    }
    
}
