import java.util.Arrays;
import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        //unused Constructor.
    }

    /**
     * Main method.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String b = scan.nextLine();
            String[] a = b.split(",");
            final long startTime = System.nanoTime();
            MergedSortImproved.sort(a);
            final long endTime = System.nanoTime();
            System.out.println(Arrays.toString(a));
            // System.out.println("---------------------------");
            // System.out.println("limit : "+MergedSortImproved.limit+" | "+"Time : "+(endTime - startTime)/1000000000.0+" secs.");
            System.out.println();

        }

    }
}
