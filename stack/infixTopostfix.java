package stack;

import java.util.Scanner;
import java.util.Stack;

public class infixTopostfix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String ans="";
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z'){
                ans=ans+ch;
            }else if(ch=='('){
                st.push(ch);
            }else if(ch==')'){
                while(!st.isEmpty()&& st.peek()!='('){
                    ans+=st.pop();
               }
               st.pop();
            }else{
                while(!st.isEmpty() && precedence(ch)<=precedence(st.peek())){
                    ans+=st.pop();
                }
                st.push(ch);
            }
        }
        while(!st.isEmpty()){
            ans=ans+st.pop();
        }
        System.out.print(ans);
}
        public static int precedence(char ch){
        if(ch=='^') return 3;
        if(ch=='/' || ch=='*') return 2;
        if(ch=='+' || ch=='-') return 1;
        return -1;
     }    
 }
