package Tree.Medium;

public class TruncateSumIsLessThanK {
    public static void main(String[] args) {
        
    }
    public static Node truncate(Node root, int k)
    {
        int target = 0;
        return truncatehelper(root, target,k);
    }


    public static Node truncatehelper(Node root,int target,int k){
        if(root==null) return null;
        target+=root.data;

        root.left=truncatehelper(root.left,target,k);
        root.right=truncatehelper(root.right,target,k);

        if(target<k||isleaf(root)){
            return null;
        }
        
        return root;
    }
    private static boolean isleaf(Node node) {
        return (node.left == null && node.right == null);
    }
    
    
}
