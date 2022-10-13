package Tree.Easy;

import java.util.LinkedList;
import java.util.Queue;

public class printBetweenTwoLevel {
    public static void main(String[] args) {
        Node root = new Node(15);
        root.left = new Node(10);
        root.right = new Node(20);
        root.left.left = new Node(8);
        root.left.right = new Node(12);
        root.right.left = new Node(16);
        root.right.right = new Node(25);
        root.right.right.right = new Node(30);
 
        int start = 2, end = 3;
        print(root, start, end);
        
    }
    public static void print(Node root,int start,int end){
        if(root==null){
            return;
        }
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        int level=0;
        while(!q.isEmpty()){
            level++;
            int size=q.size();
            while(size-->0){
            Node curr=q.poll();
            if(level>=start && level<=end){
                System.out.print(curr.data+ " ");
            }
            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
        }   
            if (level >= start && level <= end) {
                System.out.println();
            }


        }

    }
    
}
