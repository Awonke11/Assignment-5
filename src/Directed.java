package src;

import test.Perfomance;

public class Directed extends Graph {
    Perfomance perfomance;

    public Directed(Hash hash) {
        super(hash);
        Perfomance perfomance = new Perfomance(0, hash.getHashSize());
        this.perfomance = perfomance;
    }

    /**
     * @param source
     *               Traversin the graph using recursion (stack method)
     */
    @Override
    public void depthFirstTraversal(String source) {
        System.out.println(source);
        perfomance.incrementOccurance();
        for (String neighbors : this.hash.getItem(source)) {
            this.depthFirstTraversal(neighbors);
        }
    }

    /**
     * @param source
     * @param target
     * @return boolean
     *         Checking if a certain path exists in the Graph
     */
    public boolean hasPath(String source, String target) {
        if (source.equals(target))
            return true;

        for (String neighbors : this.hash.getItem(source)) {
            if (this.hasPath(neighbors, target)) {
                return true;
            }
        }

        return false;
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
