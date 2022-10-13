package Graph;

public class Topousing(BFS)Kahn'sAlgo {
    public static void main(String[] args) {
        
    }

    public static int[] toposort(int v,ArrayList<ArrayList<Integer>> adj) {

        int indegree[] = new int [v];

        for(ArrayList<Integer> list :adj){
            For(Integer e: list) {
                indegree[e]++;
            }
        }

        boolean vis[] = new boolean[v];
        ArrayList<Integer> ansList = new ArrayList<>();

        bfs(adj,v,0,vis,ansList,indegree);

        int ans[] new int[v];
        int i=0;
        for(int e:ans) {
            ans[i++] = e;
        }

        return ans;


    }

    static void bfs(ArrayList<ArrayList<Integer>> adj,int v,int n,boolean vis[],ArrayList<Integer> ans,int indegree[]) {

        Queue<Integer> q = new LinkedList<>();

        for(int i=0;i<v;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }

        while(!q.isEmpty()) {
            int curr=q.poll();
            ans.add(curr);

            for(int neighbor : adj.get(curr)) {
                if(--indegree[neighbor]==0) {
                    q.add(neighbor);
                }
            }
        }
    }
    
}
