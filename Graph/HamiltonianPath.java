package Graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HamiltonianPath {

    List<List<Integer>> graph;
    Set<Object> visitedSet;

    HamiltonianPath(int N) {
        graph = new ArrayList<>();

        for(int i = 0; i <= N + 1; i++) {
            graph.add(new ArrayList<>());
        }

        visitedSet = new HashSet<>();
    }
    public static void main(String[] args) {
        
    }
    private boolean checkIfHamiltonianPathExistsHelper(int u, int N) {
        if(visitedSet.size() == N) {
            return true;
        }

        boolean result = false;

        List<Integer> neighbours = graph.get(u);
        for(Integer eachNeighbour : neighbours) {
            if(visitedSet.contains(eachNeighbour)) {
                continue;
            }
            visitedSet.add(eachNeighbour);
            result = result || checkIfHamiltonianPathExistsHelper(eachNeighbour, N);
            visitedSet.remove(eachNeighbour);
        }

        return result;
    }

    private boolean checkIfHamiltonianPathExists(int N) {
        for(int i = 1; i <= N; i++) {
            visitedSet.add(i);
            if(checkIfHamiltonianPathExistsHelper(i, N)) {
                return true;
            }
            visitedSet.remove(i);
        }

        return false;
    }

    
}
