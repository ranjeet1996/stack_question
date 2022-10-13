package BinarySearchTree;

public class KthSmallestNode {
    public static void main(String[] args) {
        
    }
     static int result;
     static int count;
    public static int findnode(Node root,int k){
        count=0;
        findnodehelper(root, k);

        return result;
    }
    private static void findnodehelper(Node root, int k) {
        if(root!=null){
            findnodehelper(root.left,k);
            count++;

            if(count==k){
                result=root.data;
                return;
            }
            if(count<k){
                findnodehelper(root.right,k);
            }

        }
    }

    // for largest;

    int count1;
    int result1;
    
    private void helper(Node root,int K){
        if(root!=null){
            helper(root.right,K);
            count1++;
            if(count1==K){
                result1=root.data;
                return;
            }
            if(count1<K){
                helper(root.left,K);
            }
        }
    }
    // return the Kth largest element in the given BST rooted at 'root'
    public int kthLargest(Node root,int K)
    {
        //Your code here
        count1=0;
        helper(root,K);
        
        return result1;
    }

    
}
