package stack;

// import java.util.Scanner;
import java.util.Stack;

public class paranthisisCheacker {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        String s="({}))";
        System.out.print(isvalid(s));

    }
    static boolean isvalid(String s){
        Stack<Character> st=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='[') st.push(ch);
            else{
                if(st.isEmpty()) return false;
               else  if(ch==')' && st.peek()=='('|| ch=='}' && st.peek()=='{'|| ch==']' && st.peek()=='['){
                 st.pop();
               }
               else return false;
            }
        }
        if(st.isEmpty()) return true;
        else return false;
        }
    
}
