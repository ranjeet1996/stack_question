package BinarySearchTree;

import java.util.ArrayList;
import java.util.Collections;

public class ConverBtToBST {
    public static void main(String[] args) {
        
    }
    int i=0;
    // The given root is the root of the Binary Tree
    // Return the root of the generated BST
    Node binaryTreeToBST(Node root)
    {
       ArrayList<Integer> ans = new ArrayList<>();
       inOrder(root,ans);
       Collections.sort(ans);
       i = 0;
        makeBST(root,ans);
        return root;
    }
    
    void inOrder(Node root, ArrayList<Integer> ans){
        if(root==null) return;
        inOrder(root.left,ans);
        ans.add(root.data);
        inOrder(root.right,ans);
    }
    
    void makeBST(Node root, ArrayList<Integer> ans){
        if(root==null || i<0) return;
        makeBST(root.left,ans);
        root.data = ans.get(i);
        i++;
        makeBST(root.right,ans);
    }
    
}
