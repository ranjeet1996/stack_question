package Tree.Easy;

import java.util.LinkedList;
import java.util.Queue;

public class CornerPrintlevelwise {
    public static void main(String[] args) {
        
    }
    public static void cornerprint(Node root){
        if(root==null) return ;

        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            int n=size;
            while(n-->0){
                
                Node curr=q.poll();
                if(n==size-1||n==0){
                    System.out.print(curr.data+ " ");
                }
                if (curr.left != null) {
                    q.add(curr.left);
                }
 
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
            System.out.println();
        }
    }
    
}
