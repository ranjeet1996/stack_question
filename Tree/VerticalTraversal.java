package Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;
class Pair{
    int hd;
    Node node;
    Pair(int hd,Node node){
        this.hd=hd;
        this.node=node;
    }
}

public class VerticalTraversal {
    public static void main(String[] args) {
        
    }

    static ArrayList<Integer> verticalorder(Node root){
        Queue<Pair> q=new ArrayDeque<>();
        Map<Integer,ArrayList<Integer>> hm=new TreeMap<>();
        q.add(new Pair(0,root));
        while(!q.isEmpty()){
            Pair curr=q.poll();
            if(hm.containsKey(curr.hd)){
                hm.get(curr.hd).add(curr.node.data);
            }else{
                ArrayList<Integer> temp=new ArrayList<>();
                temp.add(curr.node.data);
                hm.put(curr.hd,temp);
            }
            if(curr.node.left!=null){
                q.add(new Pair(curr.hd-1,curr.node.left));
            }
            if(curr.node.right!=null){
                q.add(new Pair(curr.hd+1,curr.node.right));
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(Map.Entry<Integer,ArrayList<Integer>> entry: hm.entrySet()){
            ans.addAll(entry.getValue());
        }
        return ans;
    }

    
}
