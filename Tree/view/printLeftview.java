package Tree.view;

import java.util.ArrayList;
import java.util.List;

public class printLeftview {
    public static void main(String[] args) {
        
    }
    void printleft(Node root){
        ArrayList<Node> list=new ArrayList<>();    
         printLeftviewutil(root,list,0);
            for(Node curr:list){
                System.out.print(curr.data+" ");
            }        
    }
     void printLeftviewutil(Node root,ArrayList<Node> list,int level){
        if(root==null) return;
        if(list.get(level)==null){
            list.add(root);
        }
            printLeftviewutil(root.left, list, level+1);
            printLeftviewutil(root.right, list, level+1);
// for rightview interchange avobe two;
        
    }

    // or 
    void printrightviewutil(Node root,ArrayList<Node> list,int level){
        if(root==null) return;
            list.set(level,root);
            printLeftviewutil(root.left, list, level+1);
            printLeftviewutil(root.right, list, level+1);
        
    }

    //leetcode solution
    void printrightviewutil(Node curr,List<Integer> list,int level){
        if(curr==null) return;
              if(level == list.size()) {
            list.add(curr.data);
        }
            printrightviewutil(curr.right, list, level+1);
            printrightviewutil(curr.left, list, level+1);
        
    }
    public List<Integer> rightSideView(Node root) {
         List<Integer> result=new ArrayList<Integer>();
        printrightviewutil(root,result,0);
           return result;
               
    }
    
}
