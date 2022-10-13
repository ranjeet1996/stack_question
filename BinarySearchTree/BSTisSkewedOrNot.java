package BinarySearchTree;

public class BSTisSkewedOrNot {
    public static void main(String[] args) {
        
    }
    public static boolean isskewed(int[] preorder){
        int min=Integer.MIN_VALUE;
        int max=Integer.MAX_VALUE;

        for(int i=1;i<preorder.length;i++){
            if(preorder[i]>min && preorder[i]<max){
                if(preorder[i]>preorder[i-1]){
                    min=preorder[i-1]+1;
                }else{
                    max=preorder[i-1]-1;
                }
            }else{
                return false;
            }
        } 
        return true;
    }
    
}
