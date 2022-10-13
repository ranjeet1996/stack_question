package Tree.Traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DiagonalTraversal {
    public static void main(String[] args) {

    
        
    }
    public static List<Integer> diagonal(Node root){
        List<Integer> ans=new ArrayList<>();
        Queue<Node> q=new LinkedList<>();
        
        if(root==null) return ans;
        q.add(root);
        while(!q.isEmpty()){
            Node temp=q.peek();
            q.remove();
            while(temp!=null){
                if(temp.left!=null){
                    q.add(temp.left);
                }
                ans.add(temp.data);
                temp=temp.right;
            }
        }
        return ans;
    }

     


    
}
