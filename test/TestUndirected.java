package test;

import src.Nodes;
import src.AdjacencyList;
import src.Undirected;

public class TestUndirected {
    GenerateNodes generateNodes;
    Nodes edges;
    AdjacencyList adjacencyList;
    Undirected undirected;

    public TestUndirected(int length) {
        GenerateNodes generateNodes = new GenerateNodes(length);
        this.generateNodes = generateNodes;
        Nodes edges = generateNodes.generateNodes();
        this.edges = edges;
        AdjacencyList adjacencyList = new AdjacencyList(edges);
        this.adjacencyList = adjacencyList;
        Undirected undirected = new Undirected(adjacencyList.getHashListUndirected());
        this.undirected = undirected;
    }

    public void showTraversal() {
        undirected.depthFirstTraversal(generateNodes.startNode);
    }

    /**
     * @return String
     *         Shows the perfomance
     */
    public String showPerfomance() {
        return undirected.getPerfomance();
    }
}
