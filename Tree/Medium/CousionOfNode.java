package Tree.Medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CousionOfNode {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Node nodetoNode=new Node(4);
        printcousion(root, nodetoNode);
        
    }
    public static List<Integer> printcousion(Node root,Node nodetofind){

        ArrayList<Integer> ans=new ArrayList<>();
        Queue<Node> q=new LinkedList<>();
        q.add(root);
       int flag=0,size=0;

        while(!q.isEmpty() && flag==0){
            size=q.size();
            while(size-->0){
                Node curr=q.peek();
                q.remove();
                if(curr.left==nodetofind || curr.right==nodetofind){
                    flag=1;
                }else{
                    if(root.left!=null){
                        q.add(root.left);
                    }
                    if(root.right!=null){
                        q.add(root.right);
                    }
                }
            }
        }
       if(flag==1){
        size=q.size();
        if(size==0) ans.add(-1);

        while(!q.isEmpty()){
            ans.add(q.peek().data);
            q.remove();
        }
       }else{
        ans.add(-1);
       }
       return ans;
        
    }
    
}
