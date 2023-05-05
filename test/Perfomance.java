package test;

public class Perfomance {
    private Integer occurance = 0;
    private Integer dataSize = 0;

    public Perfomance(Integer value) {
        this.occurance = value;
    }

    public Perfomance(Integer value, Integer dataSize) {
        this.occurance = value;
        this.dataSize = dataSize;
    }

    /**
     * @return Integer
     */
    public Integer getOccurance() {
        return this.occurance;
    }

    public void incrementOccurance() {
        this.occurance++;
    }

    /**
     * @return Integer
     */
    public Integer getDataSize() {
        return this.dataSize;
    }

    /**
     * @return String
     */
    public String evaluatePerfomance() {
        if (this.occurance == 1) {
            return "Constant: O(1)";
        } else if (this.occurance > 1 && this.occurance <= this.dataSize) {
            return "Linear: O(n)";
        } else if (this.occurance <= Math.sqrt(this.dataSize) && this.occurance > this.dataSize) {
            return "Quadratic: O(n**2)";
        }
        return "";
    }
}
