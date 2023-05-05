package test;

public class Main {
    public static void main(String[] args) {

        TestDirected testDirected = new TestDirected(3);
        testDirected.showTraversal();

        TestUndirected testUndirected = new TestUndirected(21);
        testUndirected.showTraversal();
    }
}