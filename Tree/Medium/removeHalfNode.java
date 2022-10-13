package Tree.Medium;

public class removeHalfNode {
    public static void main(String[] args) {
        
    }
    public static Node newroot(Node root){
        if(root==null) return null;

        root.left=newroot(root.left);
        root.right=newroot(root.right);

        if(root.left!=null && root.right!=null ||isleaf(root)){
            return root;
        }
        Node child=(root.left!=null) ?root.left:root.right;
        return child;
    }
    private static boolean isleaf(Node node) {
        return (node.left == null && node.right == null);
    }
    
}
