public class Taxicab implements Comparable<Taxicab> {
    private final int i;
    private final int j;
    private final long sum;   // i^3 + j^3, cached to avoid recomputation

    // create a new tuple (i, j, i^3 + j^3)
    public Taxicab(int i, int j) {
        this.sum = (long) i * i * i + (long) j * j * j;
        this.i = i;
        this.j = j;
    }

    // compare by i^3 + j^3, breaking ties by i
    public int compareTo(Taxicab that) {
        if      (this.sum < that.sum) return -1;
        else if (this.sum > that.sum) return +1;
        else if (this.i < that.i)     return -1;
        else if (this.i > that.i)     return +1;
        else                          return  0;
    }

    public String toString() {
        // return i + "^3 + " + j + "^3";
        return Long.toString(sum);
    }


    public static void main(String[] args) {

        // find a^3 + b^3 = c^3 + d^3, where a, b, c, d <= n
        int n = 500;

        // initialize priority queue
        MinPQ<Taxicab> pq = new MinPQ<Taxicab>();
        for (int i = 1; i <= n; i++) {
            pq.insert(new Taxicab(i, i));
        }

        // enumerate sums in ascending order, look for repeated sums
        int run = 1;
        int counter = 0;
        Taxicab prev = new Taxicab(0, 0);   // sentinel
        while (!pq.isEmpty()) {
            Taxicab curr = pq.delMin();

            // current sum is same as previous sum
            //counter++;
            if (prev.sum == curr.sum) {
                run++;
                if (run == 2) System.out.println(prev.sum + " = " + prev);
                //System.out.println(" = " + curr + " Count : " + counter + " run :" + run);
            } else {
                run = 1;
            }
            /*else {
                if (run > 1) System.out.println();;
                run = 1;
            }*/
            prev = curr;

            if (curr.j < n) pq.insert(new Taxicab(curr.i, curr.j + 1));
        }
        //if (run > 1) System.out.println();
    }

}
