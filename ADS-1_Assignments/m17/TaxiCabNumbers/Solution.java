import java.util.Scanner;
public class Solution implements Comparable<Solution> {
    private final int sum;
    private final int i;
    private final int j;

    public Solution(int i, int j) {
        this.sum = i * i * i + j * j * j;
        this.i = i;
        this.j = j;
    }

    public int compareTo(Solution that) {
        if (this.sum < that.sum) return -1;
        if (this.sum > that.sum) return +1;
        return 0;
    }

    public String toString() {
        return Integer.toString(sum) ;
    }

    public static void main(String[] args) {
        int count = 0;
        int n = Integer.parseInt(args[0]);
        /*Scanner scan = new Scanner(System.in);
        String[] argg = scan.nextLine().split(" ");
        int n = Integer.parseInt(argg[0]);
        int c = Integer.parseInt(argg[1]);
        */
        // initialize priority queue
        int n = 500;
        MinPQ<Solution> pq = new MinPQ<Solution>();
        for (int i = 1; i <= n; i++) {
            pq.insert(new Solution(i, i));
        }

        // find smallest sum, print it out, and update
        while (!pq.isEmpty()) {
            Solution s = pq.delMin();
            System.out.println(s);
            count++;

            // if ()

            //System.out.println(s);
            //Solution t = pq.delMin();
            // if (s.sum == t.sum) {
            //     System.out.println(s);
            // }
            if (s.j < n)
                pq.insert(new Solution(s.i, s.j + 1));
        }
    }

}
