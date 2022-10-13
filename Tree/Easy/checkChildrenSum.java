package Tree.Easy;

public class checkChildrenSum {
    public static void main(String[] args) {

        Node root = new Node(25);
        root.left = new Node(12);
        root.right = new Node(13);
        root.left.left = new Node(7);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
 
        if (ischildrensumproperty(root) != Integer.MIN_VALUE) {
            System.out.println("Binary tree holds children-sum property");
        }
        else {
            System.out.println("Binary tree does not hold children-sum property");
        }
        
    }
    public static int ischildrensumproperty(Node root){
        if(root==null) return 0;

        if(root.left==null && root.right==null){
            return root.data;
        }
        int left=ischildrensumproperty(root.left);
        int right=ischildrensumproperty(root.right);

        if(left!=Integer.MIN_VALUE &&right!=Integer.MIN_VALUE && root.data==left+right){
            return root.data;
        }
        return Integer.MIN_VALUE;
    }

    
}
