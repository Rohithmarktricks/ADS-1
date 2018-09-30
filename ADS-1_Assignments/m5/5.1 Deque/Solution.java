import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**
     * Reads the inputs and displays the outputs.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Deque deque = new Deque();
        for (int i = 0; i < n; i++) {
            String[] line = scan.nextLine().split(" ");
            switch (line[0]) {
            case "pushLeft":
                deque.pushLeft(Integer.parseInt(line[1]));
                System.out.println(deque);
                break;
            case "pushRight":
                deque.pushRight(Integer.parseInt(line[1]));
                System.out.println(deque);
                break;
            case "popLeft":
                if (deque.popLeft() != null) {
                    System.out.println(deque);
                }
                break;
            case "popRight":
                if (deque.popRight() != null) {
                    System.out.println(deque);
                }
                break;
            case "size":
                System.out.println(deque.getSize());
                break;
            default:
                break;

            }
        }
    }
}
