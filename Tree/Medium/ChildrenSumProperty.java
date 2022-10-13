package Tree.Medium;

public class ChildrenSumProperty {
    public static void main(String[] args) {
        
    }
    public static int isSumProperty(Node root)
    {
        int left=0;
        int right=0;

        if(root==null ||(root.left==null && root.right==null)){
            return 1;
        }
        if(root.left!=null){
            left=root.left.data;
        }
        if(root.right!=null){
            right=root.right.data;
        }

        if ((root.data == left + right)
                && (isSumProperty(root.left) != 0)
                && isSumProperty(root.right) != 0)
                return 1;
            else
                return 0;
    }
    
}
