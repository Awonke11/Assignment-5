package src;

public class Directed extends Graph {
    public Directed(Hash hash) {
        super(hash);
    }

    @Override
    public void depthFirstTraversal(String source) {
        System.out.println(source);
        for (String neighbors : this.hash.getItem(source)) {
            this.depthFirstTraversal(neighbors);
        }
    }

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
}
