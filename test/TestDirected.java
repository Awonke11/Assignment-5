package test;

import src.Nodes;
import src.AdjacencyList;
import src.Directed;

public class TestDirected {
    GenerateNodes generateNodes;
    Nodes edges;
    AdjacencyList adjacencyList;
    Directed directed;

    public TestDirected(int length) {
        GenerateNodes generateNodes = new GenerateNodes(length);
        this.generateNodes = generateNodes;
        Nodes edges = generateNodes.generateNodes();
        this.edges = edges;
        AdjacencyList adjacencyList = new AdjacencyList(edges);
        this.adjacencyList = adjacencyList;
        Directed directed = new Directed(adjacencyList.getHashListDirected());
        this.directed = directed;
    }

    public void showTraversal() {
        directed.depthFirstTraversal(generateNodes.startNode);
    }

    /**
     * @return String
     *         Shows the perfomance
     */
    public String showPerfomance() {
        return directed.getPerfomance();
    }
}
