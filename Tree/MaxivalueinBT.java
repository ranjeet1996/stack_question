package Tree;

public class MaxivalueinBT {
    public static void main(String[] args) {
        
    }
    int maxi(Node root){
        if(root==null){
            return Integer.MIN_VALUE;
        }else{
            return Math.max(root.data,Math.max(maxi(root.left),maxi(root.right)));
        }
    }
    
}
// sc=O(h),tc=O(n);
