import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class test10 {
    static class Node{
        Node left;
        Node right;
        int data;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {

    }
    public ArrayList<Integer> bfs(int v,ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> res = new ArrayList<>();

        boolean vis[] = new boolean[v+1];
        Queue<Integer> q=new LinkedList<>();

        for(int i=0;i<v;i++){
            if(!vis[i]){
                
            }

        }
        q.add(0);
        vis[0] = true;

        while(!q.isEmpty()){
            int n=q.poll();
            res.add(n);
            for(int i: adj.get(n)){
                if(vis[i]==false){
                    q.add(i);
                }
            }

        }
        return res;
    }

}
