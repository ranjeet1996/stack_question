package Tree.view;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class Topview {
    public static void main(String[] args) {
        
    }
    static ArrayList<Integer> topview(Node root){
    Queue<Pair> q=new ArrayDeque<>();
    Map<Integer,Integer> map=new TreeMap<>();
    q.add(new Pair(0,root));
    while(!q.isEmpty()){
        Pair curr=q.poll();
        if(!map.containsKey(curr.hd)){
            map.put(curr.hd,curr.node.data);
        }
        if(curr.node.left!=null){
            q.add(new Pair(curr.hd-1,curr.node.left));
        }
        if(curr.node.right!=null){
            q.add(new Pair(curr.hd+1,curr.node.right));
        }
    }
    ArrayList<Integer> ans=new ArrayList<>();
    for(Map.Entry<Integer,Integer>entry:map.entrySet()){
       ans.add(entry.getValue());
    }
    return ans;

    }
    static class Pair{
        int hd;
        Node node;
        public Pair(int hd,Node node){
            this.hd=hd;
            this.node=node;
        }  
    }

    
}
