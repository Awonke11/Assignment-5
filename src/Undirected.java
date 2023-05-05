package src;

import java.util.HashSet;

import java.util.Set;

import test.Perfomance;

public class Undirected extends Graph {
    private Set<String> visited = new HashSet<>();
    Perfomance perfomance;

    public Undirected(Hash hash) {
        super(hash);
        Perfomance perfomance = new Perfomance(0, hash.getHashSize());
        this.perfomance = perfomance;
    }

    /**
     * @param source
     *               Traversin the graph using recursion (stack method) and handling
     *               the loop route of the edges
     */
    @Override
    public void depthFirstTraversal(String source) {
        System.out.println(source);
        this.visited.add(source);
        perfomance.incrementOccurance();

        for (String neighbors : this.hash.getItem(source)) {
            if (!this.visited.contains(neighbors)) {
                this.depthFirstTraversal(neighbors);
            }
        }
    }

    /**
     * @return String
     *         Evaluates the performance of the algorithm
     */
    @Override
    public String getPerfomance() {
        return "Number of executions: " + perfomance.getOccurance() + ". Complexity: "
                + perfomance.evaluatePerfomance();
    }
}
