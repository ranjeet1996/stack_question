package Graph;

import java.util.ArrayList;

public class DFS {
    public static void main(String[] args) {
        
    }

    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans=new ArrayList<>();

        boolean[] visited=new boolean[V+1];
        for(int i=0;i<V;i++){
            if(!visited[i]){
                dfs(adj,i,visited,ans);
            }
        }
        return ans;
    }

    public void dfs(ArrayList<ArrayList<Integer>> adj,int start,boolean[] visited,ArrayList<Integer> ans) {
        visited[start] =true;
        ans.add(start);

        for(int i:adj.get(start)){
            if(visited[i]==false){
                dfs(adj,i,visited,ans);
            }
        }
    }
    
}
