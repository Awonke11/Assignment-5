package src;

import java.util.ArrayList;

public class AdjacencyList {
    private Nodes nodes;

    public AdjacencyList(Nodes nodes) {
        this.nodes = nodes;
    }

    public Hash getHashListDirected() {
        Hash hash = new Hash();

        for (String[] node : nodes.getNodes()) {
            if (!hash.contains(node[0])) {
                hash.addItem(node[0], new ArrayList<String>());
            }
            hash.getItem(node[0]).add(node[1]);
            hash.addItem(node[1], new ArrayList<String>());
        }

        return hash;
    }

    public Hash getHashListUndirected() {
        Hash hash = new Hash();

        for (String[] node : nodes.getNodes()) {
            if (!hash.contains(node[0])) {
                hash.addItem(node[0], new ArrayList<String>());
            }
            if (!hash.contains(node[1])) {
                hash.addItem(node[1], new ArrayList<String>());
            }
            hash.getItem(node[0]).add(node[1]);
            hash.getItem(node[1]).add(node[0]);
        }

        return hash;
    }

    public Nodes getNodes() {
        return nodes;
    }
}
