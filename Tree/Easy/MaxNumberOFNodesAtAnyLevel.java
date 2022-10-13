package Tree.Easy;

import java.util.LinkedList;
import java.util.Queue;

public class MaxNumberOFNodesAtAnyLevel {
    public static void main(String[] args) {
        
    }
    public static int maxwidth(Node root){
        if(root==null) return 0;

        Queue<Node> q=new LinkedList<>();
        q.add(root);

        int max=0;
        while(!q.isEmpty()){      
            int size=q.size();
            
            if(size>max){
                max=size;
            }
            while(size-->0){
                Node curr=q.poll();
                if(root.left!=null){
                    q.add(curr.left);
                }
                if(root.right!=null){
                    q.add(curr.right);
                }
            }
        }
        return max;
        
    }
    
}
