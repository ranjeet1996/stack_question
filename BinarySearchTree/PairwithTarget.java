package BinarySearchTree;

import java.util.HashSet;
import java.util.Set;

public class PairwithTarget {
    public static void main(String[] args) {
        
    }
    public int ispair(Node root,int target){
        Set<Integer> hs=new HashSet<>();
        boolean ans=util(root,target,hs);
        return ans?1:0;
        }
    
    static boolean util(Node root,int sum,Set<Integer> hs){
        if(root==null){
            return false;           
        }
        if(util(root.left,sum,hs)==true){
            return true;
        }
        if(hs.contains(sum-root.data)){
            return true;
        }
        hs.add(root.data);
        return util(root.right,sum,hs);
    }
    
}
