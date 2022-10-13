package Tree.Easy;

public class SymetricOrNot {
    public static void main(String[] args) {
        
    }
    public static boolean issymetric(Node root){
        if(root==null) return true;

        return helper(root.left,root.right);
    }
    private static boolean helper(Node left, Node right) {
       if(left==null && right==null) return true;

       return (left!=null &&right!=null) && helper(left.left, right.right) && helper(left.right, right.left);
    }
   
    
}
