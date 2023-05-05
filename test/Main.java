package test;

import src.*;

public class Main {
    public static void main(String[] args) {

        Nodes edges = new Nodes();
        edges.addNode("a", "b");
        edges.addNode("a", "c");
        edges.addNode("b", "d");
        edges.addNode("d", "f");
        edges.addNode("c", "e");
        edges.addNode("f", "e");

        AdjacencyList adjacencyList = new AdjacencyList(edges);

        Directed directed = new Directed(adjacencyList.getHashListDirected());
        // directed.depthFirstTraversal("a");
        // System.out.println(directed.shortestPath("a", "e"));

        Undirected undirected = new Undirected(adjacencyList.getHashListUndirected());
        undirected.depthFirstTraversal("a");
        // System.out.println(undirected.shortestPath("a", "e"));
    }
}