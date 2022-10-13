package Graph;

import java.util.Stack;

public class TopologycalSort(DFS) {
    public static void main(String[] args) {
        
    } 

    public static int[] toposort(int v,ArrayList<ArrayList<Integer>> adj) {
        boolean vis[] new boolean[v];
        Stack<Integer> st= new Stack<>();

        for(int i=0;i<v;i++){
            if(!vis[i]){
                dfs(adj,i,st,vis);
            }
        }

        int ans[] new int[v];
        int i=0;
        while(!st.isEmpty()) {
            ans[i++] = st.pop();
        }

        return ans;
    }

    static void dfs(ArrayList<ArrayList<Integer>> adj,int v, Stack<integer> st,boolean[] vis) {
        vis[] = true;

        for(int neighbor : adj.get(v)) {
            if(!vis[neighbor]) {
                dfs(adj,neighbor,st,vis);
            }
        }

        st.push(v);
    }



    
}
