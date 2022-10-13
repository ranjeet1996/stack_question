package BinarySearchTree;

public class LowestCommanAcenter {
    public static void main(String[] args) {
        
    }


    // by BST method;

    public static boolean search(Node root, Node key)
    {
        // traverse the tree and search for the key
        while (root != null)
        {
            // if the given key is less than the current node, go to the left
            // subtree; otherwise, go to the right subtree
 
            if (key.data < root.data) {
                root = root.left;
            }
            else if (key.data > root.data) {
                root = root.right;
            }
            // if the key is found, return true
            else if (key == root) {
                return true;
            }
            else {
                return false;
            }
        }
 
        // we reach here if the key is not present in the BST
        return false;
    }

    public static Node LCA(Node root, Node x, Node y)
    {
        // return if the tree is empty or `x` or `y` is not present
        // in the tree
        if (root == null || !search(root, x) || !search(root, y)) {
            return null;
        }
 
        // start from the root node
        Node curr = root;
 
        // traverse the tree
        while (curr != null)
        {
            // if both `x` and `y` is smaller than the root, LCA exists in the
            // left subtree
            if (curr.data > Integer.max(x.data, y.data)) {
                curr = curr.left;
            }
 
            // if both `x` and `y` are greater than the root, LCA exists in the
            // right subtree
            else if (curr.data < Integer.min(x.data, y.data)) {
                curr = curr.right;
            }
 
            // if one key is greater (or equal) than the root and one key is
            // smaller (or equal) than the root, then the current node is LCA
            else {
                return curr;
            }
        }
        return curr;
    }



    // previous method;
    public Node lowestCommonAncestor(Node root, Node p, Node q) {
        
        if(root==null) return null;
       if(root.data==p.data || root.data==q.data) return root;
       Node left=lowestCommonAncestor(root.left,p,q);
       Node right=lowestCommonAncestor(root.right,p,q);
       if(left==null) return right;
       if(right==null) return left;

       return root;
       
   }
    
}
