import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        //unused.
    }
    /**
     * Main method.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Team> list = new List<Team>();
        //Team[] dupTeams = new Team[(2 + 1) * (2 + 2)];
        InsertionSort is = new InsertionSort();
        int i = 0;
        while (scan.hasNext()) {
            String[] str = scan.nextLine().split(",");
            list.add(new Team(str[0], Integer.parseInt(str[1]),
                                     Integer.parseInt(str[2]),
                                     Integer.parseInt(str[2 + 1])));
        }
        scan.close();
        // Team[] teams = new Team[i];
        // for (int j = 0; j < i; j++) {
        //     teams[j] = dupTeams[j];
        // }
        is.sort(list);
        System.out.println(list.toString().replace("[", "").
                           replace("]", "").replace(", ", ","));
    }
}
