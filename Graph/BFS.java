package Graph;

public class BFS {
    public static void main(String[] args) {
        
    }

    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
       
        ArrayList<Integer> res = new ArrayList<>();
        
        boolean vis[] = new boolean[V+1];
        queue<Integer> q= new LinkedList<>();

        q.add(0);
        vis[0]=true;

        while(!q.isEmpty()){
            int n=q.poll();
            res.add(n);

            for(int i:adj.get(n)){
                if(vis[i]==false){
                    vis[i]=true;
                    q.add(i);
                }
            }
        }
        return res;
    }
    
}
