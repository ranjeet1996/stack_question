package Tree.Easy;

public class Invert {
    public static void main(String[] args) {
        
    }
    public static void invertBT(Node root){
        if(root==null) return ;

        swap(root);

        invertBT(root.left);
        invertBT(root.right);
    }
    private static void swap(Node root) {
        if(root==null) return ;

        Node temp=root.left;
        root.left=root.right;
        root.right=temp;
    }
    
}
