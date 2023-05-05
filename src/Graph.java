package src;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;

abstract class Graph {
    Hash hash = new Hash();
    private Set<String> visitedShort = new HashSet<>();

    public Graph(Hash hash) {
        this.hash = hash;
    }

    public void depthFirstTraversal(String source) {
    }

    public Integer shortestPath(String source, String target) {
        Queue<ArrayList<Object>> queue = new LinkedList<>();

        ArrayList<Object> result = new ArrayList<>();
        result.add(source);
        result.add(0);

        queue.add(result);
        visitedShort.add(source);

        while (!queue.isEmpty()) {
            ArrayList<Object> pulledArray = queue.poll();
            String pulledString = (String) pulledArray.get(0);
            Integer distance = (Integer) pulledArray.get(1);

            if (pulledString.equals(target)) {
                return distance;
            }

            for (String neighbor : this.hash.getItem(pulledString)) {
                if (!visitedShort.contains(neighbor)) {
                    visitedShort.add(neighbor);

                    ArrayList<Object> addingNeighbors = new ArrayList<Object>();
                    addingNeighbors.add(neighbor);
                    addingNeighbors.add(distance + 1);

                    queue.add(addingNeighbors);
                }
            }
        }

        return -1;
    }
}
