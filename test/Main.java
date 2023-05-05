package test;

public class Main {
    public static void main(String[] args) {

        TestDirected testDirected = new TestDirected(4);
        testDirected.showTraversal();
        System.out.println(testDirected.showPerfomance());

        // TestUndirected testUndirected = new TestUndirected(21);
        // testUndirected.showTraversal();
    }
}