import java.util.Scanner;
/**
 * Class for cube sum.
 */
class CubeSum implements Comparable<CubeSum> {
    /**
     * Sum.
     */
    private long sum;
    /**
     * Var i.
     */
    private long i;
    /**
     * Var j.
     */
    private long j;
    /**
     * Gets i.
     *
     * @return     I.
     */
    public long getI() {
        return i;
    }
    /**
     * Sets i.
     *
     * @param      i     { parameter_description }
     */
    public void setI(long i) {
        this.i = i;
    }
    /**
     * Gets the j.
     *
     * @return     The j.
     */
    public long getJ() {
        return j;
    }
    /**
     * Sets the j.
     *
     * @param      j     { parameter_description }
     */
    public void setJ(long j) {
        this.j = j;
    }
    /**
     * Gets the sum.
     *
     * @return     The sum.
     */
    public long getSum() {
        return sum;
    }
    /**
     * Sets the sum.
     *
     * @param      sum   The sum
     */
    public void setSum(long sum) {
        this.sum = sum;
    }
    /**
     * Constructs the object.
     *
     * @param      i     { parameter_description }
     * @param      j     { parameter_description }
     */
    public CubeSum(final long i1, final long j1) {
        this.sum = i1 * i1 * i1 + j1 * j1 * j1;
        setI(i1);
        setJ(j1);
    }
    /**
     * compareTo
     *
     * @param      that  The that
     *
     * @return     { int value of comparision. }
     */
    public int compareTo(CubeSum that) {
        if (this.getSum() < that.getSum()) {
            return -1;
        }
        if (this.getSum() > that.getSum()) {
            return +1;
        } else {
            return 0;
        }
    }
    /**
     * Sum.
     *
     * @return     { return sum of the cube of the numbers. }
     */
    public long sum() {
        return getSum();
    }
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        return sum + " = " + i + "^3" + " + " + j + "^3";
    }

}

/**
 * Class for taxi cab.
 */
class TaxiCab {
    /**
     * Constructs the object.
     */
    private TaxiCab() {
        //unused.
    }
    /**
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        final int thou = 1000;
        final int fifteen = 1500;
        MinPQ<CubeSum> pq = new MinPQ<CubeSum>();
        for (int i = 1; i <= thou; i++) {
            pq.insert(new CubeSum(i, i));
        }
        // int i = 0;
        CubeSum prev = new CubeSum(0, 0);
        long sum = 0;
        // for (k < n; k++) {
        int p = 1;
        int k = 0;
        while (!pq.isEmpty()) {
            CubeSum c = pq.delMin();
            if (prev.sum() == c.sum()) {
                p++;
                if (p == m) {
                    sum = c.sum();

                    if (++k == n) {
                        break;
                    }
                }
            } else {
                p = 1;
            }
            prev = c;
            if (c.getJ() < fifteen) {
                pq.insert(new CubeSum(c.getI(), c.getJ() + 1));
            }
            // }
        }
        System.out.println(sum);

    }
}
