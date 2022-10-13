package Tree.Medium;

public class BTIsSumTreeOrNot {
    public static void main(String[] args) {
        Node root = new Node(44);
        root.left = new Node(9);
        root.right = new Node(13);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        if(issumTree(root)!=Integer.MIN_VALUE){
            System.out.println("Binery tre is sum tree");
        }  else {
            System.out.println("Binary tree is not a sum tree");
        }
    }

    public static int issumTree(Node root){
        if(root==null) return 0;

        if(isleaf(root)){
            return root.data;
        }
        int left=issumTree(root.left);
        int right= issumTree(root.right);
        if(left!=Integer.MIN_VALUE && right!=Integer.MIN_VALUE && root.data==left+right);
        return 2*root.data;
        
    }
    private static boolean isleaf(Node root){
         return (root.left==null &&root.right==null);
    }
    
}
