package Tree.Easy;

public class ConvertToMirror {
    public static void main(String[] args) {
        
    }
    public static void convertMirror(Node root){
        if(root==null) return ;

        convertMirror(root.left);
        convertMirror(root.right);

        swap(root);

        
    }
    private static void swap(Node root) {
        if(root==null) return ;

        Node temp=root.left;
        root.left=root.right;
        root.right=temp;
    }
    
}
