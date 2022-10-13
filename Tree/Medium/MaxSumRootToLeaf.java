package Tree.Medium;

public class MaxSumRootToLeaf {
    public static void main(String[] args) {
        
    }
    private static boolean isleaf(Node root){
        return (root.left==null && root.right==null);
    }
    public static int maxSumHelper(Node root){
        if(root==null) return 0;
        if(isleaf(root)){
            return root.data;
        }
        int left= maxSumHelper(root.left);
        int right=maxSumHelper(root.right);

        return (left>right?left:right)+root.data;
    }

    public static void maxsum(Node root){
        int sum=maxSumHelper(root);
        System.out.println("ma sum is " + sum);
        System.out.println("the max sum path is");
        printpath(root,sum);

    }
    private static boolean printpath(Node root, int sum) {
        if(sum==0 && root==null) return true;

        if(root==null) return false;

        boolean left=printpath(root.left, sum-root.data);
        boolean right=false;

        if(!left){
            right=printpath(root.right, sum-root.data);
        }
        if(left || right){
            System.out.print(root.data+ " ");
        }
        return( left || right);

    }
    
}
