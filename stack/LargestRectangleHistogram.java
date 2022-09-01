package stack;

import java.util.Stack;

public class LargestRectangleHistogram {
    public static void main(String[] args) {
        int arr[]={2,1,5,6,2,3};
        System.out.print(histogram(arr));       
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

    

// public static int[] prevsmallest(int arr[]) {
//     int n=arr.length;
//     int pre[]=new int[n];
//     Stack<Integer> st=new Stack<>();
//         for(int i=0;i<n;i++){
//          while(!st.isEmpty() && st.peek()>=arr[i]){
//          st.pop();
//         }
//         if(st.isEmpty()){
//           pre[i]=-1;
//         }else{
//           pre[i]=st.peek();
//         }
//         st.push(arr[i]);
//          }

//      return pre;
    
// }
// public static int[] nextsmallest(int arr[]) {
//   int n=arr.length;
//   Stack<Integer> st=new Stack<>();
//   int ans[]=new int[n];
//   for(int i=n-1;i>=0;i--){
//    while(!st.isEmpty() && st.peek()>=arr[i]){
//    st.pop();
//   }
//   if(st.isEmpty()){
//     ans[i]= -1;
//   }else{
//     ans[i] = st.peek();
//   }
//   st.push(arr[i]);
//    }
//    for(int i=0;i<n;i++){
//       System.out.print(ans[i]+" ");
//    }

//      return ans;
    
// }

}
