import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        //unused constructor.
    }
    /**
     * Reads the inputs and displays the outputs.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Steque steque = new Steque();
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        while(scan.hasNext()) {
            String[] line = scan.nextLine().split(" ");
            switch (line[0]) {
            case "push":
                steque.push(Integer.parseInt(line[1]));
                System.out.println(steque);
                // steque.forEach(e -> System.out.println(e));
                break;
            case "enqueue":
                steque.enqueue(Integer.parseInt(line[1]));
                System.out.println(steque);
                // steque.forEach(e -> System.out.println(e));
                break;
            case "pop":
                if (steque.pop() != null) {
                    System.out.println(steque);
                    // steque.forEach(e -> System.out.println(e));
                }
                break;
            default:
                break;
            }
        }
    }
}
