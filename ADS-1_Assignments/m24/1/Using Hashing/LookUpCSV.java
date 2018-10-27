/**
 * Class for details.
 */
class LookUpCSV {
    /**
     * name.
     */
    private String name;
    /**
     *  marks.
     */
    private double marks;
    /**
     * Constructs the object.
     *
     * @param      name1   The name
     * @param      marks1  The marks
     */
    LookUpCSV(final String name1, final double marks1) {
        this.name = name1;
        this.marks = marks1;

    }
    /**
     * returns total.
     *
     * best case: O(1)
     * worst case: O(1)
     * average case: O(1)
     *
     * @return     toatalmarks.
     */
    public String name() {
        return this.name;
    }
    /**
     * returns s3 marks.
     *
     * best case: O(1)
     * worst case: O(1)
     * average case: O(1)
     *
     * @return     s3marks.
     */
    public double marks() {
        return this.marks;
    }
}
