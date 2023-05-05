package src;

import java.util.HashSet;

import java.util.Set;

public class Undirected extends Graph {
    private Set<String> visited = new HashSet<>();

    public Undirected(Hash hash) {
        super(hash);
    }

    @Override
    public void depthFirstTraversal(String source) {
        System.out.println(source);
        this.visited.add(source);

        for (String neighbors : this.hash.getItem(source)) {
            if (!this.visited.contains(neighbors)) {
                this.depthFirstTraversal(neighbors);
            }
        }
    }

}
