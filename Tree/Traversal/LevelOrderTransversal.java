package Tree.Traversal;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    Node left,right;
    int data;
    public Node(int data){
        this.data=data;
    }
}


public class LevelOrderTransversal {
  static Node root;

    public static void main(String[] args) {
        
    }
    //tc= O(n^2)
    void printcurrlevel(Node root,int level){
        if(root==null){
            return;
        }
        if(level==1){
            System.out.print(root.data+" ");
        }
        if(level>1){
            printcurrlevel(root.left, level-1);
            printcurrlevel(root.right, level-1);
        }
    }

    // O(n)
    void printlevelorder(Node root){
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node curr=q.poll();
            System.out.print(curr.data+" ");
            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
        }
       
    }
    void printlevelinlinebyline(Node root){
        Queue<Node> q=new LinkedList<>();
        q.add(root); q.add(null);
        while(!q.isEmpty()){
            Node curr=q.poll();
            if(curr==null){
                if(q.isEmpty()){
                    return;
                }
                q.add(null);
                System.out.println();
                continue;   
            }
            System.out.print(curr.data+" ");
            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
        }

    }

    private void printTreeLevelWise() {
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        while(!queue.isEmpty()) {
            Node temp = queue.poll();

            if(temp != null) {
                System.out.print(temp.data + " ");

                if(temp.left != null) {
                    queue.add(temp.left);
                }

                if(temp.right!= null) {
                    queue.add(temp.right);
                }
            }
            else {
                System.out.println();

                if(!queue.isEmpty()) {
                    queue.add(null);
                }
            }
        }
    }
    
}
