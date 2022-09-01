package Tree;

import java.util.ArrayList;

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
    
}
