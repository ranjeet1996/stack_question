package BinarySearchTree;

public class IncresingBst {
    public static void main(String[] args) {
        
    }
     static  Node dummy=new Node(0);
    private static void helper(Node root){
        if(root==null){
            return ;
        }
        helper(root.left);
        root.left=null;
        dummy.right=root;
        dummy = root;
        helper(root.right);
    }
    public static Node increasingbst(Node root){
        Node ans=dummy;
        helper(root);
        return ans.right;
    }
    
}
