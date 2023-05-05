package src;

import java.util.ArrayList;

public class Nodes {
    private ArrayList<String[]> nodes = new ArrayList<>();
    private String startNode;

    public Nodes(String startNode) {
        this.startNode = startNode;
    }

    public Nodes() {
    }

    /**
     * @param start
     * @param end
     *              {@summary} This will add two vertices/nodes that are already
     *              connected by an edge
     */
    public void addNode(String start, String end) {
        String[] node = { start, end };
        if (nodes.contains(node)) {
            System.out.println("Nodes [" + start + ", " + end + "] already exists.");
        } else {
            nodes.add(node);
            System.out.println("Nodes [" + start + ", " + end + "] has been added.");
        }
    }

    /**
     * @param start
     * @param end
     *              {@summary} This will remove two vertices/nodes that are already
     *              connected by an edge
     */
    public void removeNode(String start, String end) {
        String[] node = { start, end };
        if (nodes.contains(node)) {
            nodes.remove(node);
            System.out.println("Nodes [" + start + ", " + end + "] removed.");
        } else {
            System.out.println("Nodes [" + start + ", " + end + "] does not exist.");
        }
    }

    /**
     * @return ArrayList<String[]>
     *         {@summary} To avoid shadow copy, a new instance array will be
     *         returned
     *         Times Complexity and Space Complexity will be O(n)
     */
    public ArrayList<String[]> getNodes() {
        ArrayList<String[]> newArrayList = new ArrayList<String[]>();

        for (String[] items : this.nodes) {
            newArrayList.add(items);
        }

        return newArrayList;
    }

    /**
     * {@summary} This will print all the nodes with thier values
     */
    public void showNodes() {
        for (String[] node : nodes) {
            System.out.println("[" + node[0] + ", " + node[1] + "]");
        }
    }

    /**
     * @return String
     *         {@summary} This will provide access to the start node
     */
    public String getStartNode() {
        return this.startNode;
    }
}
