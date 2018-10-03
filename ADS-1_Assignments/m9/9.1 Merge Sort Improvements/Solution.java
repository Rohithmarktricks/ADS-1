import java.util.Arrays;
import java.util.Scanner;
/**
 * Class for solution.
 */
public class Solution {
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
        // StringBuffer sb = new StringBuffer();
        while (scan.hasNext()) {
            // sb.append(scan.nextLine()+":")
            String b = scan.nextLine();
            // System.out.println(b);

            String[] a = b.split(",");
            // System.out.println(Arrays.toString(a));
            MergedSortImproved.sort(a);
            System.out.println(Arrays.toString(a));
            System.out.println();

        }

    }
}
