package stack;

import java.util.Stack;

public class longestValidParanthishis {
    public static void main (String[] args) {
        // Your code here
// Scanner sc=new Scanner(System.in);
String s=")()()("; 
System.out.print(islongestvalid(s));

}
static int islongestvalid(String s){
Stack<Integer> st=new Stack<>();
st.push(-1);
int n=s.length();
int max=0;
for(int i=0;i<n;i++){
   char ch=s.charAt(i);
   if(ch=='('){
        st.push(i);
   }else{
       st.pop();
   if(st.isEmpty()){
       st.push(i);
   }
       else{
         int  len=i-st.peek();
           max=Math.max(max,len);
       }

   }
}
return max;

  
  
}
    
}
