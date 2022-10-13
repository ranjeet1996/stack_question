package Tree.Medium;

import java.util.LinkedList;
import java.util.Queue;

public class CompleteTree {
    public static void main(String[] args) {
        
    }

    public static boolean iscomplete(Node root){
        boolean end=false;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node curreNode=q.poll();
            if(curreNode==null){
                end=true;
            }else{
                if(end) return false;
                q.add(curreNode.left);
                q.add(curreNode.right);
            }
        }
        return true;
        

    }
    
}
