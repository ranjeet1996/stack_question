package Graph;

import java.util.PriorityQueue;

class Pair implements Comparable<Pair>{
    int wt;
    int v;
    Pair(int v,int wt){
        this.v=v;
        this.wt=wt;
    }
    public int Comparable(pair that){
        return this.wt-that.wt;
    }
}
//tc=ElogV  sc=v
public class MinimumSpaningTree(PrismAlgo) {
    public static void main(String[] args) {
        
    }

    static int spanningTree(int V,ArrayList<ArrayList<ArrayList<Integer>>> adj) {
        boolean[] vis=new boolean[v];
        PriorityQueue<Pair> q= new PriorityQueue<>();

        q.add(new Pair(0,0));
        int ans=0;
        while(q.size()!=0){
            Pair cur=q.remove();

            int u=cur.v;
            if(vis[u]){
                continue;
            }

            ans+=cur.wt;
            vis[u]=true;
            
            ArrayList<ArrayList<Integer> neighbors=adj.get(u);

            for(ArrayList<Integer> list : neighbors){
                int vertex=list.get(0);
                int wt=list.get(1);
                if(vis[vertex]==false){
                    q.add(new Pair(vertex,wt));
                }

            }
        }
        return ans;



    }

    
}
