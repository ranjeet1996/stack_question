package BinarySearchTree;

import java.util.Arrays;

public class CostructBalanceBSTfromKeys {
    public static void main(String[] args) {
        int[] key={15,10,20,8,12,16,25};
        Node root= construct(key);
       
        
    }
    private static Node construct(int[] key) {
       Arrays.sort(key);

       return constructHelper(key, 0, key.length-1, null);
    }
    public static Node constructHelper(int[] key,int low,int high,Node root){
        if(low>high) return root;

        int mid=(low+high)/2;

        root=new Node(key[mid]);

        root.left=constructHelper(key, low, mid-1, root.left);
        root.right=constructHelper(key, mid+1, high, root.right);

        return root;


    }
    
}
