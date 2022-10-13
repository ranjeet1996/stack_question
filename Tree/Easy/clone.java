package Tree.Easy;

public class clone {
    public static void main(String[] args) {
        
    }
    public static Node cloneBT(Node root){
        if(root==null) return null;

        Node copy=new Node(root.data);

        copy.left=cloneBT(root.left);
        copy.right=cloneBT(root.right);

        return copy;

    }
    
}
