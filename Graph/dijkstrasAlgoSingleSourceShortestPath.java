package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

class Pair implements Comparable<Pair>{
    int wt;
    int v;
    Pair(int v,int wt){
        this.v=v;
        this.wt=wt;
    }
    // public int Comparable(pair that){
    //     return this.wt-that.wt;
    // }
    @Override
    public int compareTo(Pair that) {
        // TODO Auto-generated method stub
        return this.wt-that.wt;
    }
}

public class dijkstrasAlgoSingleSourceShortestPath {
    public static void main(String[] args) {
        
    }

    static int[] dijkstra(int V,ArrayList<ArrayList<ArrayList<Integer>>> adj,int S) {
        boolean[] vis=new boolean[V];
        PriorityQueue<Pair> q=new PriorityQueue<>();

        q.add(new Pair(S,0));
        int ans[]= new int[V];
        Arrays.fill(ans,10000000);
        ans[S]=0;
        while(q.size()!=0){
            Pair cur=q.remove();

            int u=cur.v;
            if(vis[u]){
                continue;
            }

            vis[u] =true;

            ArrayList<ArrayList<Integer>> neighbors = adj.get(u);
            for(ArrayList<Integer> list: neighbors){
                int vertex=list.get(0);
                int wt=list.get(1);
                if(ans[vertex]>ans[u]+wt){
                    ans[vertex]= ans[u]+wt;
                    q.add(new Pair(vertex,ans[vertex]));
                }

            }
        }
        return ans;



    }
}
