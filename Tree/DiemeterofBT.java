package Tree;

public class DiemeterofBT {
    public static void main(String[] args) {
        
    }
    int height(Node root){
        int ans=0;
        if(root==null){
            return -1;
        }
        int leftheight=height(root.left);
        int rightheight=height(root.right);
         ans=Math.max(ans,2+leftheight+rightheight);
         return 1+ Math.max(leftheight,rightheight);
    }
// in other way
    int ans=0;
    public int diameterOfBinaryTree(Node root) {
       if(root==null )return 0;
       height1(root);
       return ans;
   }
   
   public int height1(Node root){
       //if root==null height==0
       if(root==null)return -1;
       
       int L=height(root.left);
       int R=height(root.right);
       //ans signfies(no. of nodes farthest apart) or the DIAMETER
       ans=Math.max(ans,L+R+2);
       //height of the tree is max of LST & RST +1
       return 1+Math.max(L,R);
   }
    
}
