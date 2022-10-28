package Greedy;

import java.util.Stack;

public class ValidParanthesis {

    public static void main(String[] args) {
        
    }

    public boolean checkValidString(String s){
        Stack<Integer> brackets=new Stack<>();
        Stack<Integer> asterisks=new Stack<>();

        int length=s.length();

        for(int i=0;i<length;i++){
            char ch=s.charAt(i);

            if(ch=='('){
                brackets.push(i);
            }
            else if(ch=='*'){
                asterisks.push(i);
            }
            else if(!brackets.isEmpty()){
                brackets.pop();
            }
            else if(!asterisks.isEmpty()){
                asterisks.pop();
            }
            else{
                return false;
            }
        }
        while(!brackets.isEmpty() && !asterisks.isEmpty() && brackets.peek() < asterisks.peek()){
            brackets.pop();
            asterisks.pop();
        }

        return brackets.isEmpty();
    }
    
}
