package Graph;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class EventualSafeNode {
    public static void main(String[] args) {
        
    }

    List<Integer> eventualSafeNodes(int V, List<List<Integer>> adj) {
        
        List<List<Integer>> rev  = new ArrayList<>();

for(int i=0; i<V; i++)

rev.add(new ArrayList<>());
//reversing

for(int i=0; i<V; i++)

{

   for(int j: adj.get(i))

   {

       rev.get(j).add(i);

   }

}

int indegree[] = new int[V];

for(int i=0; i<V; i++)

{

   for(int j: rev.get(i))

   {

       indegree[j]++;

   }
}
Queue<Integer> q = new LinkedList<>();

for(int i=0; i<V; i++)

if(indegree[i]==0)

q.offer(i);

ArrayList<Integer> ans= new ArrayList<>();

while(!q.isEmpty())

{

   int node = q.poll();

   ans.add(node);

   for(int it: rev.get(node))

   {

       indegree[it]--;

       if(indegree[it] ==0)

      q.offer(it); 

   }

}

Collections.sort(ans);

return ans;

}
    
}
