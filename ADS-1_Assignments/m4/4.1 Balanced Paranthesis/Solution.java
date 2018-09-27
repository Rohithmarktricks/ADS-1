import java.util.Scanner;
class Solution {


	public static boolean balancedParenthensies(String s) {
		MyStack<Character> stack = new MyStack<>();
		for (int i = 0; i < s.length(); i++) {
			Character c = s.charAt(i);
			if (c == '[' || c == '(' || c == '{' ) {
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
	public static void main(String[] args) {
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