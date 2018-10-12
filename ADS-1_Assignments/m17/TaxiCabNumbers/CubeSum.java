public class CubeSum implements Comparable<CubeSum> {
    private final int sum;
    private final int i;
    private final int j;

    public CubeSum(int i, int j) {
        this.sum = i * i * i + j * j * j;
        this.i = i;
        this.j = j;
    }

    public int compareTo(CubeSum that) {
        if (this.sum < that.sum) return -1;
        if (this.sum > that.sum) return +1;
        return 0;
    }

    public String toString() {
        return sum + " = " + i + "^3" + " + " + j + "^3";
    }


    public static void main(final String[] args) {

        //int n = Integer.parseInt(args[0]);
        int n = 500;
        int limit = 2;
        int count = 0;
        int times = 0
                    // initialize priority queue
                    MinPQ<CubeSum> pq = new MinPQ<CubeSum>();
        for (int i = 1; i <= n; i++) {
            pq.insert(new CubeSum(i, i));
        }

        // find smallest sum, print it out, and update
        while (!pq.isEmpty()) {
            CubeSum s = pq.delMin();
            Cubesum checker = s;
            if (pq.delMin() == checker) {
                times++;
            }
            if (count == 400)
                //System.out.println(s);
                if (s.j < n)
                    pq.insert(new CubeSum(s.i, s.j + 1));
        }
    }

}
