/**
 * Class for details.
 */
class Studentdetails implements Comparable<Studentdetails> {
    /**
     * name of student.
     */
    private String name;
    /**
     * date of birth.
     */
    private String dob;
    /**
     * subject 1 marks.
     */
    private Integer s1marks;
    /**
     * subject 2 marks.
     */
    private Integer s2marks;
    /**
     * subject 3 marks.
     */
    private Integer s3marks;
    /**
     * totalmarks.
     */
    private Integer total;
    /**
     * reservation category.
     */
    private String rcat;
    /**
     * constuctor.
     *
     * @param      stu   name of student
     * @param      date   date of birth
     * @param      s1     subject 1 marks
     * @param      s2     subject 2 marks
     * @param      s3     subject 3 marks
     * @param      to     total marks
     * @param      res    reservation
     */
    Studentdetails(final String stu, final String date, final Integer s1,
     final Integer s2, final Integer s3, final Integer to, final String res) {
        this.name = stu;
        this.dob = date;
        this.s1marks = s1;
        this.s2marks = s2;
        this.s3marks = s3;
        this.total = to;
        this.rcat = res;

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
    public Integer gettotal() {
        return this.total;
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
    public Integer gets3marks() {
        return this.s3marks;
    }
    /**
     * returns s2 marks.
     *
     * best case: O(1)
     * worst case: O(1)
     * average case: O(1)
     *
     * @return     s2marks.
     */
    public Integer gets2marks() {
        return this.s2marks;
    }
    /**
     * returns date no of birth.
     *
     * best case: O(1)
     * worst case: O(1)
     * average case: O(1)
     *
     * @return     date..
     */
    public String getdob() {
        return this.dob;
    }
    /**
     * returns reservation.
     *
     * best case: O(1)
     * worst case: O(1)
     * average case: O(1)
     *
     * @return     reservation.
     */
    public String getres() {
        return this.rcat;
    }
    /**
     * returns int.
     *
     * best case: O(1)
     * worst case: O(1)
     * average case: O(1)
     *
     * @return     int.
     */
    /**
     * comparedate.
     *
     * @param      that  The that
     *
     * @return     { description_of_the_return_value }
     */
    public Integer comparedate(final Studentdetails that) {
        String[] d1 = this.getdob().split("-");
        String[] d2 = that.getdob().split("-");
        if (Integer.parseInt(d1[2]) > Integer.parseInt(d2[2])) {
            return 1;
        } else if (Integer.parseInt(d1[2]) < Integer.parseInt(d2[2])) {
            return -1;
        } else if (Integer.parseInt(d1[1]) < Integer.parseInt(d2[1])) {
            return 1;
        } else if (Integer.parseInt(d1[1]) < Integer.parseInt(d2[1])) {
            return -1;
        } else if (Integer.parseInt(d1[0]) < Integer.parseInt(d2[0])) {
            return 1;
        } else if (Integer.parseInt(d1[0]) < Integer.parseInt(d2[0])) {
            return -1;
        } else {
            return 0;
        }
    }
    /**
    * Returns a string representation of the object.
    *
    * @return     String representation of the object.
    * best case: O(1)
    * worst case: O(1)
    * average case: O(1)
    */
    public String toString() {
        return name + "," + Integer.toString(total) + "," + rcat;
    }
    /**
         * Checks the various attributes and returns -1 or 0 or 1 accordingly.
         *
         * @param      that  The that
         *
         * @return     -1 or 0 or 1
         */
    public int compareTo(final Studentdetails that) {
        if (this.gettotal() > that.gettotal()) {
            return 1;
        } else if (this.gettotal() < that.gettotal()) {
            return -1;
        } else if (this.gets3marks() > that.gets3marks()) {
            return 1;
        } else if (this.gets3marks() < that.gets3marks()) {
            return -1;
        } else if (this.gets2marks() > that.gets2marks()) {
            return 1;
        } else if (this.gets2marks() < that.gets2marks()) {
            return -1;
        } else {
            return comparedate(that);
        }
    }
}
