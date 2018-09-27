import java.util.Scanner;
/**
 * Class for solution.
 */
final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        //unused Constructor.
    }
    /**
     * Checks if Parenthesis is balanced.
     *
     * @param      s     String.
     *
     * @return     Trueif balanced, Otherwise False.
     */
    public static boolean balancedParenthensies(final String str) {
        MyStack<Character> stack = new MyStack<>();
        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            if (c == '[' || c == '(' || c == '{') {
                stack.push(c);
            } else if (c == ']') {
                if (stack.isEmpty() || stack.pop() != '[') {
                    return false;
                }
            } else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            } else if (c == '}') {
                if (stack.isEmpty() || stack.pop() != '{') {
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }
    /**
     * Main method.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        while (scan.hasNext()) {
            if (balancedParenthensies(scan.next())) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
