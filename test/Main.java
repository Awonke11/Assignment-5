package test;

public class Main {
    public static void main(String[] args) {

        TestDirected testDirected = new TestDirected(20);
        testDirected.showTraversal();
        System.out.println(testDirected.showPerfomance());

        TestDirected testDirected2 = new TestDirected(5);
        testDirected2.showTraversal();
        System.out.println(testDirected2.showPerfomance());

        TestDirected testDirected3 = new TestDirected(1);
        testDirected3.showTraversal();
        System.out.println(testDirected3.showPerfomance());

        TestUndirected testUndirected = new TestUndirected(20);
        testUndirected.showTraversal();
        System.out.println(testUndirected.showPerfomance());

        TestUndirected testUndirected2 = new TestUndirected(5);
        testUndirected2.showTraversal();
        System.out.println(testUndirected2.showPerfomance());

        TestUndirected testUndirected3 = new TestUndirected(1);
        testUndirected3.showTraversal();
        System.out.println(testUndirected3.showPerfomance());
    }
}