package Tree.Easy;

import java.util.ArrayList;
import java.util.List;

 class Node
{
    Node left;
    Node right;
    int data;
    List<Node> child;
 
    Node(int data)
    {
        this.data = data;
        child = new ArrayList<>();
    }
}

public class MirrorOfMaryTREE {
    public static void main(String[] args) {

          // construct an m–ary tree
          Node root = new Node(1);
 
          (root.child).add(new Node(2));
          (root.child).add(new Node(3));
          (root.child).add(new Node(4));
          (root.child).add(new Node(5));
          (root.child).add(new Node(6));
   
          (root.child.get(0).child).add(new Node(7));
          (root.child.get(0).child).add(new Node(8));
          (root.child.get(0).child).add(new Node(9));
   
          (root.child.get(2).child).add(new Node(10));
          (root.child.get(2).child).add(new Node(11));
          (root.child.get(2).child).add(new Node(12));
   
          (root.child.get(4).child).add(new Node(13));
          (root.child.get(4).child).add(new Node(14));
   
          (root.child.get(0).child.get(1).child).add(new Node(15));
          (root.child.get(0).child.get(1).child).add(new Node(16));
   
          (root.child.get(4).child.get(0).child).add(new Node(17));
          (root.child.get(4).child.get(0).child).add(new Node(18));
          (root.child.get(4).child.get(0).child).add(new Node(19));
          (root.child.get(4).child.get(0).child).add(new Node(20));
   
          convertmirror(root);
          printTree(root);
        
    }

    public static void printTree(Node root)
    {
        // base case
        if (root == null) {
            return;
        }
 
        // print the current node
        System.out.print(root.data + " ");
 
        // recur for all children nodes from left to right
        for (Node child: root.child) {
            printTree(child);
        }
    }


    public static void convertmirror(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");

        for(Node child:root.child){
            convertmirror(child);
        }
        int n=root.child.size();

        for(int i=0,j=n-1;i<j;i++,j--){
            Node temp=root.child.get(i);
            root.child.set(i,root.child.get(i));
            root.child.set(j,temp);
        }
    }
    
}
