package test;

import java.util.Random;

import src.Nodes;

public class GenerateNodes {
    String startNode;
    Nodes node = new Nodes(startNode);
    int length = 0;
    String[] listOfAlphabets = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p",
            "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };

    public GenerateNodes(int length) {
        this.startNode = listOfAlphabets[this.getRandomNumber()];
        this.length = length;
    }

    public Nodes generateNodes() {
        String[] anythingArray = new String[length];
        node.addNode(startNode, listOfAlphabets[this.getRandomNumber()]);

        for (String anything : anythingArray) {
            node.addNode(listOfAlphabets[this.getRandomNumber()], listOfAlphabets[this.getRandomNumber()]);
        }

        return node;
    }

    public int getRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(listOfAlphabets.length);
    }
}
